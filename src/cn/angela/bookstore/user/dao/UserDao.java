package cn.angela.bookstore.user.dao;

import java.sql.SQLException;

import cn.angela.bookstore.user.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import lib.TxQueryRunner;

/**
 * user持久层
 */

public class UserDao {
    private QueryRunner qr = new TxQueryRunner();
    
    
    /**
     * 按username查询user
     * @param username
     * @return
     */
    public User findByUsername(String username) {
        try {
            String sql = "select * from tb_user where username=?";
            return qr.query(sql, new BeanHandler<User>(User.class),username);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    /**
     * 按email查询user
     * @param email
     * @return
     */
    public User findByEmail(String email) {
        try {
            String sql = "select * from tb_user where email=?";
            return qr.query(sql, new BeanHandler<User>(User.class),email);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 插入User
     * @param user
     */
    public void addUser(User user) {
        try {
            String sql = "insert into tb_user values(?,?,?,?)";
            Object[] params = {user.getUid(),user.getUsername(),
                    user.getPassword(),user.getEmail()};
            qr.update(sql,params);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

}
