package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.servlet.BaseServlet;
import domain.User;
import service.userService;

public class userServlet extends BaseServlet {
	userService uService = new userService();

	public String login(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		User user = uService.login(name, password);
		HttpSession session = request.getSession();
		if (user != null) {
			session.setAttribute("user", user);
			System.out.println("登录成功！");

			return "/index.jsp";
		} else {
			System.out.println("登录失败！");
			return "/msg.jsp";
		}

	}
}
