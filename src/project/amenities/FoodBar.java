package project.amenities;

import project.room.MotelRoom;

public class FoodBar extends Amenity {

    /**
     * cost of a food bar
     */
    public static final double COST = 10;

    private MotelRoom room;

    public FoodBar(MotelRoom room) {
        this.room = room;
    }

    /**
     * return description of room with a food bar
     */
    @Override
    public String toString() {
        return room.toString() + " with a food bar";
    }

    /**
     * return cost of room with food bar
     */
    @Override
    public double cost() {
        return room.cost() + COST;
    }
}
