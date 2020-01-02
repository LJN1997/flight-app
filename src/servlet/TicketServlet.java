package servlet;

import entity.Ticket;
import service.ITicketService;
import service.TicketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Guozz
 * @since JDK 1.8
 * date:2020/1/1 19:05
 */
@WebServlet("/ticket")
public class TicketServlet extends HttpServlet {
    private ITicketService ticketService = new TicketServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        int  flightId = Integer.parseInt(request.getParameter("flightId"));
        Ticket ticket = new Ticket();
        ticket.setFlightId(flightId);
        ticket.setUserId(userId);
        int i = ticketService.insertTicket(ticket);
        if(i>0){
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("fail.jsp").forward(request,response);
        }
    }
}
