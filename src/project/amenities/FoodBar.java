package project.amenities;

import project.room.Room;

public class FoodBar extends Amenity {

    /**
     * cost of a food bar
     */
    public static final double COST = 10;

    public FoodBar(Room room) {
        super(room);
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
    public double getRate() {
        return room.getRate() + COST;
    }
}
