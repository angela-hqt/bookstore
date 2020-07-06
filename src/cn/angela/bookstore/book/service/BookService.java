package cn.angela.bookstore.book.service;

import java.util.List;

import cn.angela.bookstore.book.dao.BookDao;
import cn.angela.bookstore.book.domain.Book;

public class BookService {
    private BookDao bookDao = new BookDao();

    /**
     * 查询所有图书
     * @return
     */
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    /**
     * 按分类查询图书
     * @return
     */
    public List<Book> findByCid(String cid) {
        return bookDao.findByCid(cid);
    }

    /**
     * 按id查询图书
     * @param bid
     * @return
     */
    public Book findByBid(String bid) {
        return bookDao.findByBid(bid);
    }

}
