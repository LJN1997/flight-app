package servlet;

import com.alibaba.fastjson.JSON;
import entity.ShowPrice;
import service.ShowPriceService;
import service.ShowPriceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="ShowPriceServlet", urlPatterns = "/show"	)
public class ShowPriceServlet extends HttpServlet {
    //--调用service层接口
    private ShowPriceService showPriceService =new ShowPriceServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //--设置编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        List<ShowPrice> showPrices = showPriceService.showPrice();

        String data = JSON.toJSONString(showPrices);
        System.out.println(data);
        req.setAttribute("data",data);

        req.getRequestDispatcher("show.jsp").forward(req,resp);
    }
}
