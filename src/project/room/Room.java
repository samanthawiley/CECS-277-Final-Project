package project.room;

public abstract class Room {

    private String roomNumber;
    double cost;
    long checkInTime;

    /**
     * Default constructor. Allows decorators to be instantiated without a room number
     */
    protected Room() {

    }

    protected Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    @Override
    public String toString() {
        return String.format("Room %s\t$%f per night\t", roomNumber, cost);
    }

    public double getRate() {
        return cost;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void checkIn() {
        checkInTime = System.currentTimeMillis();
    }

    /**
     * Returns time (in milliseconds) checkIn() was last called
     * @return
     */
    public long getCheckInTime() {
        return checkInTime;
    }
}