public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("13945", "Delhi",
                "Mumbai", "DepartureDateTime", "ArrivalDateTime",
                "6E", 6000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("12650", "India", "England",
                "DepartureDateTime", "ArrivalDateTIme",
                "10C", 18000, false, null, null,
                "London Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
