package project.amenities;

import project.room.MotelRoom;

public class AutoRefillingFoodBar extends Amenity {

    /**
     * cost of an autorefilling food bar
     */
    public static final double COST = 15;

    private MotelRoom room;

    public AutoRefillingFoodBar(MotelRoom room) {
        this.room = room;
    }

    /**
     * return description of room with an autorefilling food bar
     */
    @Override
    public String toString() {
        return room.toString() + " with an autorefilling food bar";
    }

    /**
     * return cost of room with an autorefilling food bar
     */
    @Override
    public double cost() {
        return room.cost() + COST;
    }
}
