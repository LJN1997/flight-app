package servlet;

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
        StringBuffer str1 = new StringBuffer();
        str1.append("[");
        StringBuffer str2 = new StringBuffer();
        str2.append("[");
        for (ShowPrice showPrice : showPrices) {
            String name = showPrice.getName();
            double value = showPrice.getValue();
            str1.append("'");
            str1.append(name);
            str1.append("'");
            str1.append(",");
            str2.append(value);
            str2.append(",");
        }
        str1.deleteCharAt(str1.length()-1);
        str1.append("]");
        str2.deleteCharAt(str2.length()-1);
        str2.append("]");

        System.out.println(str1);
        System.out.println(str2);

        req.setAttribute("data1",str1);
        req.setAttribute("data2",str2);

        req.getRequestDispatcher("show.jsp").forward(req,resp);
    }
}
