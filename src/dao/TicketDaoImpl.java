package dao;

import entity.Ticket;
import util.DateUtil;
import util.JdbcUtil;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.Date;

/**
 * @author: Guozz
 * @since JDK 1.8
 * date:2020/1/1 18:39
 */
public class TicketDaoImpl implements ITicketDao {

    @Override
    public int insertTicket(Ticket ticket) {
        try {
            Connection connect = JdbcUtil.createConnect();
            String sql = "insert into ticket (user_id,flight_id,order_time) " +
                    "value("+ticket.getUserId()+","+ ticket.getFlightId()+",'"+ DateUtil.dateToString("yyyy-MM-dd hh:mm:ss",new Date())+"')";
            PreparedStatement statement =
                    connect.prepareStatement(sql);
            int i = statement.executeUpdate();
            if(i>0){
                return 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


}
