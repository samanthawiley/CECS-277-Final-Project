package project.amenities;

import project.room.MotelRoom;

public class FoodBar extends RoomAmenities {
    /**cost of a food bar*/
    public static final double COST = 10;

    /**add a food bar to a room
     */
    public FoodBar(MotelRoom roomType) {
        this.roomType = roomType;
    }

    /** return description of room with food bar
     */
    public String getDescription() {
        return roomType.getDescription() + " with a food bar";
    }

    /** return cost of room with food bar
     */
    public double cost() {
        return roomType.cost() + COST;
    }
}