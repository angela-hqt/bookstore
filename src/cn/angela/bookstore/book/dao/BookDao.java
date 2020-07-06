package cn.angela.bookstore.book.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.angela.bookstore.book.domain.Book;
import cn.angela.bookstore.category.domain.Category;
import cn.knight.utils.CommonUtils;

public class BookDao {
    private QueryRunner qr = new TxQueryRunner();
    
    /**
     * 查询所有图书
     * @return
     */
    public List<Book> findAll(){
        String sql = "select * from book ";
        try {
            return qr.query(sql, new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 根据分类查找图书
     * @param cid
     * @return
     */
    public List<Book> findByCid(String cid) {
        String sql = "select * from book where cid=?";
        try {
            return qr.query(sql, new BeanListHandler<Book>(Book.class), cid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 根据Bid加载图书
     * @param bid
     * @return
     */
    public Book findByBid(String bid) {
        String sql = "select * from book where bid=?";
        try {
            Map<String,Object> map =  qr.query(sql, new MapHandler(), bid);
            Category category = CommonUtils.toBean(map, Category.class);
            Book book = CommonUtils.toBean(map, Book.class);
            book.setCategory(category);
            return book;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
