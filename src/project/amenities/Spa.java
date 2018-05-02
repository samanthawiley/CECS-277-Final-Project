package project.amenities;

import project.room.MotelRoom;

public class Spa extends Amenity {

    /**
     * cost of a spa
     */
    public static final double COST = 20;

    public Spa(MotelRoom room) {
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
    public double cost() {
        return room.cost() + COST;
    }
}
