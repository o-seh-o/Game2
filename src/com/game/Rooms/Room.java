package com.game.Rooms;

/**
 * Created by Shiva on 5/2/2016.
 * The room class is your basic room.
 * It has an ID, and width/height dimensions.
 * It has at least one door, and zero or more windows.
 *
 */
public abstract class Room {
    private String roomName;
    private long roomID;
    private int width;
    private int length;
    private int numDoors;
    private boolean enemyPresent;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public long getRoomID() {
        return roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isEnemyPresent() {
        return enemyPresent;
    }

    public void setEnemyPresent(boolean enemyPresent) {
        this.enemyPresent = enemyPresent;
    }

    public void printMyStats(){
        System.out.println("My Room Stats are:" +
                "\nRoom ID: " + getRoomID() +
                "\nRoom Name: " + getRoomName() +
                "\nRoom Width: " + getWidth() +
                "\nRoom Length: " + getLength());
    }
}
