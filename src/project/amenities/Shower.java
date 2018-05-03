package project.amenities;

import project.room.Room;

public class Shower extends Amenity {

    /**
     * cost of a spray resistant shower
     */
    public static final double COST = 25;

    public Shower(Room room) {
        super(room);
    }

    /**
     * return description of room with a spray resistant shower
     */
    @Override
    public String toString() {
        return room.toString() + " with a spray resistant shower";
    }

    /**
     * return cost of room with spray resistant shower
     */
    @Override
    public double getRate() {
        return room.getRate() + COST;
    }
}
