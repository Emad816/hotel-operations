package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room() {
        this.numberOfBeds = 0;
        this.price = 0;
        this.isOccupied = false;
        this.isDirty = false;
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
        if (!isOccupied) {
            isDirty =  false;
        }else {
            System.out.println("Room is till occupied!");
        }

    }
}
