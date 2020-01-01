package entity;

import java.util.Objects;

public class DTOFlightCity {
    private int flightId;
    private String flightNumber;
    private int fromCityId;
    private String fromCityName;
    private int toCityId;
    private String toCityName;
    private String departureTime;
    private String arrivalTime;
    private double price;

    public DTOFlightCity(int flightId, String flightNumber, int fromCityId, String fromCityName, int toCityId, String toCityName, String departureTime, String arrivalTime, double price) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.fromCityId = fromCityId;
        this.fromCityName = fromCityName;
        this.toCityId = toCityId;
        this.toCityName = toCityName;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DTOFlightCity{" +
                "flightId=" + flightId +
                ", flightNumber='" + flightNumber + '\'' +
                ", fromCityId=" + fromCityId +
                ", fromCityName='" + fromCityName + '\'' +
                ", toCityId=" + toCityId +
                ", toCityName='" + toCityName + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTOFlightCity that = (DTOFlightCity) o;
        return flightId == that.flightId &&
                fromCityId == that.fromCityId &&
                toCityId == that.toCityId &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(flightNumber, that.flightNumber) &&
                Objects.equals(fromCityName, that.fromCityName) &&
                Objects.equals(toCityName, that.toCityName) &&
                Objects.equals(departureTime, that.departureTime) &&
                Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, flightNumber, fromCityId, fromCityName, toCityId, toCityName, departureTime, arrivalTime, price);
    }

    public DTOFlightCity() {
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFromCityId() {
        return fromCityId;
    }

    public void setFromCityId(int fromCityId) {
        this.fromCityId = fromCityId;
    }

    public String getFromCityName() {
        return fromCityName;
    }

    public void setFromCityName(String fromCityName) {
        this.fromCityName = fromCityName;
    }

    public int getToCityId() {
        return toCityId;
    }

    public void setToCityId(int toCityId) {
        this.toCityId = toCityId;
    }

    public String getToCityName() {
        return toCityName;
    }

    public void setToCityName(String toCityName) {
        this.toCityName = toCityName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
