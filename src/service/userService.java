package service;

import dao.UserDao;
import domain.User;

public class userService {

	UserDao uDao = new UserDao();

	public User login(String name, String password) {
		User user = uDao.login(name, password);
		return user;
	}
}
