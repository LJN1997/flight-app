package dao;

import entity.Flight;

import java.util.List;

public interface AdminToFlightDao {
    //增加航班
    public int insert();
    //删除航班
    public int delete();
    //查询航班
    public List<Flight> find();
    //修改航班
    public int updateFlight();

}
