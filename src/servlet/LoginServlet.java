package servlet;

import entity.User;
import service.SignUpAndLoginService;
import service.SignUpAndLoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="LoginServlet", urlPatterns = "/login"	)
public class LoginServlet extends HttpServlet {
    //--调用service层接口
    private SignUpAndLoginService signUpAndLoginService =new SignUpAndLoginServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //--设置编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        //--获取前端参数
        String role = req.getParameter("role");
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");

        //--角色判断，如果是1执行管理员登录，如果是2执行用户登录
        if(role.equals("1")){
            //--调用管理员登录方法
            boolean b1 = signUpAndLoginService.adminLogin(userName, userPassword);
            //--如果数据库存在账号返回管理员主页，否则nook
            if (b1){
                resp.sendRedirect("flight");
            }else {
                PrintWriter writer = resp.getWriter();
                writer.println("nook");
                writer.flush();
                writer.close();
            }
        }else if (role.equals("2")){
            //--调用用户登录方法
            User user = signUpAndLoginService.userLogin(userName, userPassword);
            //--如果数据库存在账号返回用户主页，否则nook
            if (user != null){
                req.getSession().setAttribute("userId",user.getUserId());
                resp.sendRedirect("userindex.jsp");
            }else {
                PrintWriter writer = resp.getWriter();
                writer.println("nook");
                writer.flush();
                writer.close();
            }

        }

    }
}
