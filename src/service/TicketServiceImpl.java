package service;

import dao.ITicketDao;
import dao.TicketDaoImpl;
import entity.Ticket;

/**
 * @author: Guozz
 * @since JDK 1.8
 * date:2020/1/1 18:39
 */
public class TicketServiceImpl implements ITicketService{
    private ITicketDao ticketDao = new TicketDaoImpl();
    @Override
    public int insertTicket(Ticket ticket) {
        return ticketDao.insertTicket(ticket);
    }
}
