package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.User;
import utils.DataSourceUtils;

public class UserDao {
    public void addUser(User user)  {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into user(name,password,mail) values(?,?,?)";
        try {
			runner.update(sql, user.getName(), user.getPassword(), user.getMail());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void deleteUser(String name)  {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "delete from user where name=?";
        try {
			runner.update(sql, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void updateUser(User user)  {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "update user set name=?,password=?,mail=?,intro=?,image=? where name=?";
        try {
			runner.update(sql, user.getName(), user.getPassword(), user.getMail(), user.getIntro(), user.getImage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public User login(String name,String password)
    {
    	QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select* from user where name=? and password=?";
        User user = null;
		try {
			user = runner.query(sql, new BeanHandler<User>(User.class), name,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
    }
    public void verifyName() {
		
	}
}
