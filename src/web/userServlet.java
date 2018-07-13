package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.servlet.BaseServlet;
import domain.User;
import service.userService;

public class userServlet extends BaseServlet {
	userService uService = new userService();

	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		User user = uService.login(name, password);
		HttpSession session = request.getSession();
		if (user != null) {
			session.setAttribute("user", user);
			System.out.println("登录成功！");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			//return "/index.jsp";
		} else {
			PrintWriter out=response.getWriter(); 
			out.print("<script language='javascript'>alert('登录失败!!');window.location.href='sign-in.jsp';</script>");        
			
		}

	}
}
