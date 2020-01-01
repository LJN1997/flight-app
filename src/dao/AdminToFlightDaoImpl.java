package dao;

import entity.DTOFlightCity;
import entity.Flight;
import util.DateUtil;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminToFlightDaoImpl implements AdminToFlightDao{

    @Override
    public List<DTOFlightCity> findFlightAll() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        List<DTOFlightCity> list = new ArrayList<>();
        try {
            conn = JdbcUtil.createConnect();
            stat = conn.createStatement();
            String sql = "select * from flight f left join city c on  f.to_city_id=c.city_id left join city c1 on  f.from_city_id=c1.city_id";
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                DTOFlightCity flight = new DTOFlightCity();
                flight.setFlightId(rs.getInt(1));
                flight.setFlightNumber(rs.getString(2));
                flight.setFromCityId(rs.getInt(3));
                flight.setToCityId(rs.getInt(4));
                flight.setDepartureTime(DateUtil.dateToString("yyyy-MM-dd HH:mm:ss",rs.getTimestamp(5)));
                flight.setArrivalTime(DateUtil.dateToString("yyyy-MM-dd HH:mm:ss",rs.getTimestamp(6)));
                flight.setPrice(rs.getDouble(7));
                flight.setToCityName(rs.getString(9));
                flight.setFromCityName(rs.getString(11));
                list.add(flight);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return list;
    }

    @Override
    public String delFlight(int id) {
        Connection conn = null;
        Statement stat = null;
        try {
            conn = JdbcUtil.createConnect();
            stat = conn.createStatement();
            String sql = "delete from flight where flight_id="+id;
            int result = stat.executeUpdate(sql);
            if(result>0){
                return "ok";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return "no";
    }

    @Override
    public String updateFlight(Flight flight)  {
        Connection conn = null;
        Statement stat = null;
        try {
            conn = JdbcUtil.createConnect();
            stat = conn.createStatement();
            String sql = "UPDATE flight set flight_number='"+flight.getFlightNumber()+"',from_city_id='"+flight.getFromCityId()+"',to_city_id='"+flight.getToCityId()+"',departure_time='"+flight.getDepartureTime()+"',arrival_time='"+flight.getArrivalTime()+"',price='"+flight.getPrice()+"' where flight_id='"+flight.getFlightId()+"'";
            int result = stat.executeUpdate(sql);
            if(result>0){
                return "ok";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return "no";
    }

    @Override
    public String save(Flight flight)  {
        Connection conn = null;
        Statement stat = null;
        try {
            conn = JdbcUtil.createConnect();
            stat = conn.createStatement();
            String sql = "INSERT into flight(flight_number,from_city_id,to_city_id,departure_time,arrival_time,price) VALUES('"+flight.getFlightNumber()+"','"+flight.getFromCityId()+"','"+flight.getToCityId()+"','"+flight.getDepartureTime()+"','"+flight.getArrivalTime()+"','"+flight.getPrice()+"')";
            int result = stat.executeUpdate(sql);
            if(result>0){
                return "ok";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return "no";
    }
}
