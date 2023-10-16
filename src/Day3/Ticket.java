package Day3;

public class Ticket {
	
	private int TicketId;
	private int Price;
	private static int availableTickets;
	public int getTicketId() {
		return TicketId;
	}
	public void setTicketId(int ticketId) {
		TicketId = ticketId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	\
	
	
	
	
	
	
	

}
