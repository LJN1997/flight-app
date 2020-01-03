package service;

import entity.Ticket;

/**
 * @author: Guozz
 * @since JDK 1.8
 * date:2020/1/1 18:39
 */
public interface ITicketService {
    /**
     *  插入订单：
     *       成功返回1
     *       失败返回0
     * @param ticket
     * @return
     */
    int insertTicket(Ticket ticket);
}
