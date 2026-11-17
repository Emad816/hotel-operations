package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double endTime;
    private boolean isPunchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        double regularHours = 0;
        if (hoursWorked > 0 && hoursWorked <= 40) {
            regularHours = hoursWorked;
        } else if (hoursWorked > 40) {
            regularHours = 40;
        }
        return regularHours;
    }

    public double getOvertimeHours() {
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public double getTotalPay() {
        double totalPay = 0;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * payRate;
        }else if (hoursWorked > 40) {
            totalPay = (40 * payRate) + ((hoursWorked - 40) * (1.5 * payRate));
        }
        return totalPay;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public boolean isPunchedIn() {
        return isPunchedIn;
    }


    //punch in and punch out method with double parameters
    public void punchIn(double time) {
        isPunchedIn = true;
        this.startTime = time;
    }

    public void punchOut(double time) {
        this.endTime = time;
        isPunchedIn = false;

        hoursWorked += endTime - startTime;
        System.out.println("Punsh in at " + startTime
                + " Punch out at " + time + " hours worked " + (endTime - startTime));
    }

    //Punch in & out time card method
    public void punchTimeCard(double time) {
        if (!isPunchedIn) {
            startTime = time;
            isPunchedIn = true;
        }else {
            endTime = time;
            hoursWorked += endTime - startTime;
            System.out.println("Punch in at " + startTime
                    + " Punch out at " + time + " hours worked " + (endTime - startTime));
            isPunchedIn = false;
        }
    }

    //Punch in using current time
    public void punchIn() {
        isPunchedIn = true;
        LocalTime timeNow = LocalTime.now();
        this.startTime = timeNow.getHour() + timeNow.getMinute()/60.0;
        System.out.println("Punch in at " + startTime);
    }

    //Punch out using current time
    public void punchOut() {
        isPunchedIn = false;
        LocalTime timeNow = LocalTime.now();
        this.endTime = timeNow.getHour() + timeNow.getMinute()/60.0;
        hoursWorked += endTime - startTime;
        System.out.println("Punch in at " + startTime
                + " Punch out at " + endTime + " hours worked " + (endTime - startTime));
    }



}
