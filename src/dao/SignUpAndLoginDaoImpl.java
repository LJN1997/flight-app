package dao;


import entity.User;
import util.JdbcUtil;

import java.sql.*;

public class SignUpAndLoginDaoImpl implements SignUpAndLoginDao {
    //--用户注册
    @Override
    public boolean userRegister(String userName, String userPassword) {
        Statement statement = null;
        try {
            //--获取连接
            Connection conn = JdbcUtil.createConnect();
            //--创建执行对象
            statement = conn.createStatement();
            //--准备sql，查询数据库中是否有数据，有返回false，无则插入数据
            String sql1 = "select * from `user` where user_name='" + userName + "' and user_password='" + userPassword + "'";
            //--获取结果集
            ResultSet rs = statement.executeQuery(sql1);
            if (rs.next()) {
                //System.out.println(rs.next());
                return false;
            } else {
                //--插入的sql
                String sql = "INSERT INTO `user` (user_name,user_password) VALUES ('" + userName + "','" + userPassword + "')";
                int num = statement.executeUpdate(sql);
                if (num > 0) {
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //--关闭资源
                statement.close();
                JdbcUtil.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    //--用户登录
    @Override
    public User userLogin(String userName, String userPassword) {
        Statement stat = null;
        ResultSet rs = null;
        User user=null;
        try {
            //--获取数据库连接
            Connection conn = JdbcUtil.createConnect();
            //--创建执行对象
            stat = conn.createStatement();
            //--准备sql语句
            String sql = "select * from `user` where user_name='" + userName + "' and user_password='" + userPassword + "'";
            //--获取结果集
            rs = stat.executeQuery(sql);
            //--结果集不为空，返回true，否则返回false

            if (rs.next()) {
                user =new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setUserPassword(rs.getString("user_password"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //--关闭资源
            try {
                rs.close();
                stat.close();
                JdbcUtil.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    //--管理员登录
    @Override
    public boolean adminLogin(String adminName, String adminPassword) {

        Statement stat = null;
        ResultSet rs = null;
        try {
            //-- 获取连接
            Connection conn = JdbcUtil.createConnect();
            //--创建执行对象
            stat = conn.createStatement();
            //--准备sql语句
            String sql = "select * from admin where admin_name='" + adminName + "' and admin_password='" + adminPassword + "'";
            //--获取结果集
            rs = stat.executeQuery(sql);
            //--结果集不为空返回true,否则返回false
            if (rs.next()) {
                //System.out.println(rs.next());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //--关闭资源
            try {
                rs.close();
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return false;
    }
}
