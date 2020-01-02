package servlet;


import service.AdminToFlightService;
import service.AdminToFlightServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delFlight")
public class DelFlightServlet extends HttpServlet {
    private AdminToFlightService service = new AdminToFlightServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String status = service.delFlight(id);
        response.sendRedirect("flight");
    }
}
