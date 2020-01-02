package servlet;


import entity.Flight;
import service.AdminToFlightService;
import service.AdminToFlightServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/saveFlight")
public class SaveFlightServlet extends HttpServlet {
    private AdminToFlightService service = new AdminToFlightServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        Flight flight = new Flight();
        flight.setFlightNumber(request.getParameter("flightNumber"));
        flight.setFromCityId(Integer.parseInt(request.getParameter("fromCityId")));
        flight.setToCityId(Integer.parseInt(request.getParameter("toCityId")));
        flight.setDepartureTime(request.getParameter("departureTime"));
        flight.setArrivalTime(request.getParameter("arrivalTime"));
        flight.setPrice(Double.parseDouble(request.getParameter("price")));
        String save = service.save(flight);
        response.sendRedirect("flight");
    }
}
