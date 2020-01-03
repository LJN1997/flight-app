package dao;

import entity.Ticket;

/**
 * @author: Guozz
 * @since JDK 1.8
 * date:2020/1/1 18:38
 */
public interface ITicketDao {
    /**
     *  插入订单：
     *       成功返回1
     *       失败返回0
     * @param ticket
     * @return
     */
    int insertTicket(Ticket ticket);
}
