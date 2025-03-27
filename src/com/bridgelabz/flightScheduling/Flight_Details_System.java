package com.bridgelabz.flightScheduling;

public class Flight_Details_System {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "New Delhi", "California");
        Flight<Integer> flight2 = new Flight<>(102, "Amritsar", "Banglore");

        Booking<Integer> booking1 = new Booking<>(3002, flight1, "Ankush Sharma");
        Booking<Integer> booking2 = new Booking<>(3003, flight2, "Ansh");

        booking1.displayBookingInfo();
        System.out.println("----------------");
        booking2.displayBookingInfo();

        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();

    }
}
