package project.amenities;

import project.room.Room;

public class AutoRefillingFoodBar extends Amenity {

    /**
     * cost of an autorefilling food bar
     */
    public static final double COST = 15;

    public AutoRefillingFoodBar(Room room) {
        super(room);
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
