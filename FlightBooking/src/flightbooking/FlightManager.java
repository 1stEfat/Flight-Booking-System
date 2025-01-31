package flightbooking;
import java.util.ArrayList;
public class FlightManager {
    private ArrayList<Flight> flights;
    public FlightManager() {
            this.flights = new ArrayList<>();
    }
    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
    public void removeFlight(Flight flight) {
        this.flights.remove(flight);
    }
    public void updateFlight(String flightNumber, Flight updatedFlight) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber().equals(flightNumber)) {
                flights.set(i, updatedFlight);
                break;
            }
        }
    }
    public ArrayList<Flight> viewAllFlights() {
        return this.flights;
    }
    public Flight getFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }
}