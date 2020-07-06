package cn.angela.bookstore.category.service;

import java.util.List;

import cn.angela.bookstore.book.dao.BookDao;
import cn.angela.bookstore.category.dao.CategoryDao;
import cn.angela.bookstore.category.domain.Category;

public class CategoryService {
    private CategoryDao  categoryDao = new CategoryDao();
    private BookDao bookDao = new BookDao();

    /**
     * 查看所有分类
     * @return
     */
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

}
