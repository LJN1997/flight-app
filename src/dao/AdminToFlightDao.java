package dao;

import entity.DTOFlightCity;
import entity.Flight;

import java.util.List;

public interface AdminToFlightDao {
    List<DTOFlightCity> findFlightAll();
    String delFlight(int id) ;
    String updateFlight(Flight flight);
    String save(Flight flight) ;
}
