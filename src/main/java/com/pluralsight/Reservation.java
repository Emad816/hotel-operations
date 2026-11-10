package com.pluralsight;

public class Reservation {

    String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        switch (roomType){
            case "king" -> price = 139.00;
            case "double" -> price = 124.00;
            default -> price = -1;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        if (roomType.equals("king")) {
            double price = 139.00 * numberOfNights;
            if(isWeekend) {
                return price + (price * 0.10);
            }
            return price;
        } else if (roomType.equals("double")) {
            double price = 124.00 * numberOfNights;
            if(isWeekend) {
                return price + (price * 0.10);
            }
            return price;
        }else {
            System.out.println("invalid room type");
        }
        return price;
    }
}
