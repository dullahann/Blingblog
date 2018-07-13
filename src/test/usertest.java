package test;

import java.sql.SQLException;

import dao.UserDao;
import domain.User;
import service.userService;

public class usertest {
	public static void main(String[] args)  {
		
     userService usService = new userService();
      User user = usService.login("123", "123");
      System.out.println(user.getName());
	
	}
}
