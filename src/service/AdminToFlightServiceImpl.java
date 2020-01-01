package service;

import dao.AdminToFlightDao;
import dao.AdminToFlightDaoImpl;
import entity.DTOFlightCity;
import entity.Flight;

import java.util.List;

public class AdminToFlightServiceImpl implements AdminToFlightService{
    private AdminToFlightDao dao = new AdminToFlightDaoImpl();
    @Override
    public List<DTOFlightCity> findFlightAll()  {
        return dao.findFlightAll();
    }

    @Override
    public String delFlight(int id)  {
        return dao.delFlight(id);
    }

    @Override
    public String updateFlight(Flight flight){
        return dao.updateFlight(flight);
    }

    @Override
    public String save(Flight flight)  {
        return dao.save(flight);
    }
}
