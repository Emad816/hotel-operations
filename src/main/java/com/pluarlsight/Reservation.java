package com.pluarlsight;

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
        if (roomType.equals("king")) {
            double price = 139.00 * numberOfNights;
            if(isWeekend) {
                return price + (price * 0.10);
            }
            return 139.00 * numberOfNights;
        } else if (roomType.equals("double")) {
            double price = 124.00 * numberOfNights;
            if(isWeekend) {
                return price + (price * 0.10);
            }
            return 124.00 * numberOfNights;
        }
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

        return price * numberOfNights;
    }
}
