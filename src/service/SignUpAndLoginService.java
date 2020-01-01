package service;

public interface SignUpAndLoginService {
    //用户注册
    public void userRegister(String userName,String userPassword);

    //用户登录
    public void userLogin(String userName,String userPassword);

    //管理员登录
    public  void adminLogin(String adminName,String adminPassword);
}
