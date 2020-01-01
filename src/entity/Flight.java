package entity;

public class Flight {
	private int flightId;
	private String flightNumber;
	private int fromCityId;
	private int toCityId;
	private String departureTime;
	private String arrivalTime;
	private double price;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String flightNumber, int fromCityId, int toCityId, String departureTime,
			String arrivalTime, double price) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.fromCityId = fromCityId;
		this.toCityId = toCityId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.price = price;
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
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the fromCityId
	 */
	public int getFromCityId() {
		return fromCityId;
	}
	/**
	 * @param fromCityId the fromCityId to set
	 */
	public void setFromCityId(int fromCityId) {
		this.fromCityId = fromCityId;
	}
	/**
	 * @return the toCityId
	 */
	public int getToCityId() {
		return toCityId;
	}
	/**
	 * @param toCityId the toCityId to set
	 */
	public void setToCityId(int toCityId) {
		this.toCityId = toCityId;
	}
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + flightId;
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + fromCityId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + toCityId;
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
		Flight other = (Flight) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (flightId != other.flightId)
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (fromCityId != other.fromCityId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (toCityId != other.toCityId)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", fromCityId=" + fromCityId
				+ ", toCityId=" + toCityId + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", price=" + price + "]";
	}
	
}
