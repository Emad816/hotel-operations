package com.pluarlsight;

public class Main {
    public static void main(String[] args) {

        Reservation emad = new Reservation("king", 5);

        System.out.println(emad.getReservationTotal());


        Room n0718 = new Room(false, false );

        System.out.println(n0718.isAvailable());


        Employee employee = new Employee(047, "emad", "HR", 21.00, 55);
        System.out.println(employee.getTotalPay());



    }
}
