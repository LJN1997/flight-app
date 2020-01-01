package dao;


import entity.Admin;
import entity.User;
import util.JdbcUtil;

import java.sql.*;

public class SignUpAndLoginDaoImpl implements SignUpAndLoginDao {

    @Override
    public boolean userRegister(String userName, String userPassword) {
        Connection conn = null;
        PreparedStatement pstmt= null;
        boolean status = userLogin(userName,userPassword);
        try {
            //--获取数据库连接
            conn = JdbcUtil.createConnect();
            //--若数据库不存在用户，则添加用户
            if(!status){
                //--准备sql语句
                String sql = "insert into `user` (user_name,user_password) values(?,?)";
                //--创建执行对象
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, userPassword);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //--关闭资源
        JdbcUtil.close();
        return false;
    }

    @Override
    public boolean userLogin(String userName, String userPassword) {
        Connection conn = null;
        try {
            //--获取数据库连接
            conn = JdbcUtil.createConnect();
            //--准备sql语句
            String sql1="select * from `user` where user_name=? and user_password=?";
            //--创建执行对象
            PreparedStatement pstmt=conn.prepareStatement(sql1);
            pstmt.setString(1, userName);
            pstmt.setString(2, userPassword);
            //--获取结果集
            ResultSet resultSet = pstmt.executeQuery();
            //--结果集不为空，返回true，否则返回false
            if(resultSet.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //--关闭资源
        JdbcUtil.close();
        return false;
    }

    @Override
    public boolean adminLogin(String adminName, String adminPassword) {
        try {
            //--准备sql语句
            String sql = "select * from admin where admin_name=? and admin_password=?";
            //--创建执行对象
            PreparedStatement preparedStatement = JdbcUtil.createConnect().prepareStatement(sql);
            preparedStatement.setString(1,adminName);
            preparedStatement.setString(2,adminPassword);
            //--结果集不为空返回true,否则返回false
            if(preparedStatement.executeQuery().next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //--关闭资源
        JdbcUtil.close();
        return false;
    }
}
