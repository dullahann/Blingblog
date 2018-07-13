package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Comment;
import utils.DataSourceUtils;

public class CommentDao {
    public void addComment(Comment com) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into comment values(?,?,?,?)";
        runner.update(sql, com.getAid(), com.getCid(), com.getContent(), com.getName());
    }
    public void deleteComment(String cid) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "delete from comment where cid=?";
        runner.update(sql, cid);
    }
    public List<Comment> selectByAid(String aid) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from comment where aid=?";
        List<Comment> commentList = runner.query(sql, new BeanListHandler<Comment>(Comment.class), aid);
        return commentList;
    }
}
