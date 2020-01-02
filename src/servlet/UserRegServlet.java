package servlet;

import service.SignUpAndLoginService;
import service.SignUpAndLoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SignUpAndLoginServlet",
        urlPatterns = "/userReg"	)
public class UserRegServlet extends HttpServlet {
    //--调用service层接口
    private SignUpAndLoginService signUpAndLoginService =new SignUpAndLoginServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //--设置编码格式
        //resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        //--获取前端参数
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");
/*        System.out.println(userName);
        System.out.println(userPassword);*/
        //--调用用户注册方法
        boolean b = signUpAndLoginService.userRegister(userName, userPassword);
        //--如果注册成功返回OK，否则nook
       if(b){
           PrintWriter writer = resp.getWriter();
           writer.println("ok");
           writer.flush();
           writer.close();
       }else {
           PrintWriter writer = resp.getWriter();
           writer.println("nook");
           writer.flush();
           writer.close();
       }

    }
}
