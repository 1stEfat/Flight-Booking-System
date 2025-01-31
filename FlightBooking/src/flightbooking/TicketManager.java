package flightbooking;
import java.util.ArrayList;
public class TicketManager {
     private ArrayList<Ticket> tickets;
    public TicketManager() {
        tickets = new ArrayList<>();
    }
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
}

