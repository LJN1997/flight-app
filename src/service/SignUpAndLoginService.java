package service;

import entity.User;

public interface SignUpAndLoginService {
    //用户注册
    public boolean userRegister(String userName,String userPassword);

    //用户登录
    public User userLogin(String userName, String userPassword);

    //管理员登录
    public  boolean adminLogin(String adminName,String adminPassword);
}
