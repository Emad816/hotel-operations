package com.pluarlsight;

public class Main {
    public static void main(String[] args) {

        //testing reservation class
        Reservation emad = new Reservation("king", 5);

        System.out.println(emad.getReservationTotal());

        //testing room class
        Room n0718 = new Room(false, false );

        System.out.println(n0718.isAvailable());

        n0718.checkIn();
        System.out.println(n0718.isDirty());

        n0718.checkOut();
        System.out.println(n0718.isOccupied());

        n0718.cleanRoom();
        System.out.println(n0718.isDirty());



        // Testing employee class
        Employee employee1 = new Employee(047, "emad",
                "HR", 20.00, 32);

        employee1.punchIn(08.00);
        employee1.punchOut(16.00);
        System.out.println("Total hours worked : " + employee1.getHoursWorked());

        System.out.println("total pay " + employee1.getTotalPay() + "$");



    }
}
