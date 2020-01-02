package servlet;


import entity.DTOFlightCity;
import service.AdminToFlightService;
import service.AdminToFlightServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userflight")
public class UserFindAllFlightServlet extends HttpServlet {
    private AdminToFlightService service = new AdminToFlightServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        List<DTOFlightCity> flightAll = service.findFlightAll();
        request.setAttribute("data",flightAll);
        request.getRequestDispatcher("userflight.jsp").forward(request,response);
    }
}
