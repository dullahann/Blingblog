package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import domain.Manager;
import utils.DataSourceUtils;

public class ManagerDao {
    public void addManager(Manager manager) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into comment values(?,?)";
        runner.update(sql, manager.getMid(), manager.getPassword());
    }
    public void deleteManager(String mid) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "delete from manager where mid=?";
        runner.update(sql, mid);
    }
    public void updateManager(Manager manager) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "update manager set password=? where mid=?";
        runner.update(sql, manager.getMid(), manager.getPassword());
    }
    
}
