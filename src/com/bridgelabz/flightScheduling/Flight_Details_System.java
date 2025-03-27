package com.bridgelabz.flightScheduling;

public class Flight_Details_System {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "Chandigarh", "Russia");
        Flight<Integer> flight2 = new Flight<>(102, "Banglore", "Spain");

        Booking<Integer> booking1 = new Booking<>(3002, flight1, "Akshit Chauhan");
        Booking<Integer> booking2 = new Booking<>(3003, flight2, "Harshit Sharma");

        booking1.displayBookingInfo();
        System.out.println("----------------");
        booking2.displayBookingInfo();

        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();

    }
}
