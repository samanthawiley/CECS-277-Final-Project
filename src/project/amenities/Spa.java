package project.amenities;

import project.room.Room;

public class Spa extends Amenity {

    /**
     * cost of a spa
     */
    public static final double COST = 20;

    public Spa(Room room) {
        super(room);
    }

    /**
     * return description of room with a spa
     */
    @Override
    public String toString() {
        return room.toString() + " with a spa";
    }

    /**
     * return cost of room with a spa
     */
    @Override
    public double getRate() {
        return room.getRate() + COST;
    }
}
