package service;

import entity.DTOFlightCity;
import entity.Flight;

import java.util.List;

public interface AdminToFlightService {
    List<DTOFlightCity> findFlightAll() ;
    String delFlight(int id);
    String updateFlight(Flight flight);
    String save(Flight flight);
}
