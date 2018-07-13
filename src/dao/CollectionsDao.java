package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Collections;
import utils.DataSourceUtils;

public class CollectionsDao {
    public void addCollections(Collections col) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into collections values(?,?,?)";
        runner.update(sql, col.getAid(), col.getCid(), col.getName());
    }
    public void deleteCollections(String cid) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "delete from collections where cid=?";
        runner.update(sql, cid);
    }
    public List<Collections> selectByName(String name) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from collections where name=?";
        List<Collections> collectionsList = runner.query(sql, new BeanListHandler<Collections>(Collections.class), name);
        return collectionsList;
    }
}
