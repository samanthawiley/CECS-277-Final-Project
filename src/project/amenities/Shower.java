package project.amenities;

import project.room.MotelRoom;

public class Shower extends Amenity {

    /**
     * cost of a spray resistant shower
     */
    public static final double COST = 25;

    private MotelRoom room;

    public Shower(MotelRoom room) {
        this.room = room;
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
    public double cost() {
        return room.cost() + COST;
    }
}
