package servlet;

import service.SignUpAndLoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpAndLoginServlet extends HttpServlet {
    //--调用service层接口
    private SignUpAndLoginService signUpAndLoginService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");
        String adminName = req.getParameter("adminName");
        String adminPassword = req.getParameter("adminPassword");
        signUpAndLoginService.userRegister(userName,userPassword);
        signUpAndLoginService.userLogin(userName,userPassword);
        signUpAndLoginService.adminLogin(adminName,adminPassword);


    }
}
