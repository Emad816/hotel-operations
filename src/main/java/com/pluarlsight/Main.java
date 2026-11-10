package com.pluarlsight;

public class Main {
    public static void main(String[] args) {



        // Testing employee class
        Employee emad = new Employee(047, "emad",
                "HR", 20.00, 2);

        //punch time card method
        emad.punchTimeCard(8);
        emad.punchTimeCard(16);

        //punch in & out with local date method
        emad.punchIn(08.06);
        emad.punchOut();

        System.out.println("Total hours worked : " + emad.getHoursWorked());


    }
}
