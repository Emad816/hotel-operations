package com.pluarlsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(boolean isDirty, boolean isOccupied) {
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {

        if (!isOccupied && !isDirty){
            return true;
        }else  {
            return false;
        }
    }

    public void checkIn() {
        isOccupied = true;
        isDirty =  true;
    }

    public void checkOut() {
        isOccupied = false;
        isDirty = true;
    }

    public void cleanRoom() {
        isOccupied = false;
        isDirty =  false;
        isAvailable = true;
    }
}
