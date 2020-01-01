package service;

import dao.SignUpAndLoginDao;

public class SignUpAndLoginServiceImpl implements SignUpAndLoginService{
   //--调用dao层接口
    private SignUpAndLoginDao signUpAndLoginDao;

    @Override
    public void userRegister(String userName, String userPassword) {
        //--调用用户注册方法
        signUpAndLoginDao.userRegister(userName,userPassword);
    }

    @Override
    public void userLogin(String userName, String userPassword) {
        //--调用用户登录方法
        signUpAndLoginDao.userLogin(userName,userPassword);
    }

    @Override
    public void adminLogin(String adminName, String adminPassword) {
        //--调用管理员登录方法
        signUpAndLoginDao.adminLogin(adminName,adminPassword);
    }
}
