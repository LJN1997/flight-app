package service;

import dao.SignUpAndLoginDao;
import dao.SignUpAndLoginDaoImpl;

public class SignUpAndLoginServiceImpl implements SignUpAndLoginService{
   //--调用dao层接口
    private SignUpAndLoginDao signUpAndLoginDao=new SignUpAndLoginDaoImpl();

    @Override
    public boolean userRegister(String userName, String userPassword) {
        //--调用用户注册方法
        return  signUpAndLoginDao.userRegister(userName,userPassword);
    }

    @Override
    public boolean userLogin(String userName, String userPassword) {
        //--调用用户登录方法
        return signUpAndLoginDao.userLogin(userName,userPassword);
    }

    @Override
    public boolean adminLogin(String adminName, String adminPassword) {
        //--调用管理员登录方法
        return signUpAndLoginDao.adminLogin(adminName,adminPassword);
    }
}
