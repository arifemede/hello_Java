package miniProject.bus.ticket.calculation;

public class Ticket {

// distance, journey type, price, seat number

    public double distance;

    public int journeyType;

    public int seatNo;

    public double price;


    // to print these values on the ticket

    public void printTicket(Bus bus){  // we use bus object here to be able to call object in this class

        System.out.println("---Ticket details---");

        System.out.println("Bus number: " + bus.busNum);

        System.out.println("Distance:" + this.distance);

        System.out.println("Type of journey:" + (this.journeyType ==1 ? "One way" : "Round Trip"));

        System.out.println("Your seat no:" + this.seatNo);

        System.out.println("Total price: " + this.price);

        System.out.println("Have a nice trip!");


    }


}
