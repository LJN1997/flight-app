package entity;

public class Ticket {
	private int ticketId;
	private int userId;
	private int flightId;
	private String orderTime;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticketId, int userId, int flightId, String orderTime) {
		super();
		this.ticketId = ticketId;
		this.userId = userId;
		this.flightId = flightId;
		this.orderTime = orderTime;
	}
	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the flightId
	 */
	public int getFlightId() {
		return flightId;
	}
	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	/**
	 * @return the orderTime
	 */
	public String getOrderTime() {
		return orderTime;
	}
	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flightId;
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + ticketId;
		result = prime * result + userId;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (flightId != other.flightId)
			return false;
		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (ticketId != other.ticketId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", userId=" + userId + ", flightId=" + flightId + ", orderTime="
				+ orderTime + "]";
	}
	
}
