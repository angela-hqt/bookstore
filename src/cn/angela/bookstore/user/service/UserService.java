package cn.angela.bookstore.user.service;

import cn.angela.bookstore.user.domain.User;
import cn.angela.bookstore.user.dao.UserDao;


/**
 * User业务层
 */
public class UserService {
    private UserDao userDao = new UserDao();
    
    /**
     * 注册
     * @param form
     * @throws UserException
     */
    public void regist(User form) throws UserException {
        User user = userDao.findByUsername(form.getUsername());
        // 校验用户名
        if(user != null) throw new UserException("用户名已被注册！");
        
        // 校验email
        user = userDao.findByEmail(form.getEmail());
        if(user != null) throw new UserException("Email已被注册！");
        
        // 插入用户到数据库
        userDao.addUser(form);
    }
    

    /**
     * 登录
     * @param username
     * @return
     * @throws UserException
     */
    public User login(User form) throws UserException{
        User user = userDao.findByUsername(form.getUsername());
        
        if(user == null) throw new UserException("用户名不存在!");
        
        if(!form.getPassword().equals(user.getPassword())) throw new UserException("密码错误！");
        
        return user;
    }
}
