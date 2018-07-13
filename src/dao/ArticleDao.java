package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Article;
import utils.DataSourceUtils;

public class ArticleDao {
    public void addArticle(Article article) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into article values(?,?,?,?,?,?,?,?)";
        runner.update(sql, article.getAid(), article.getContent(), article.getName(), article.getRead_time(),
        		article.getRecommend(), article.getSummary(), article.getTitle(), article.getType());
    }
    public void deleteArticle(String aid) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "delete from article where aid=?";
        runner.update(sql, aid);
    }
    public List<Article> selectAll() throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from article";
        List<Article> articleList = runner.query(sql, new BeanListHandler<Article>(Article.class));
        return articleList;
    }
    public List<Article> selectByTitle(String title) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from article where title like '%?%'";
        List<Article> articleList = runner.query(sql, new BeanListHandler<Article>(Article.class), title);
        return articleList;
    }
    public List<Article> selectByType(String type) throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from article where type=?";
        List<Article> articleList = runner.query(sql, new BeanListHandler<Article>(Article.class), type);
        return articleList;
    }
}
