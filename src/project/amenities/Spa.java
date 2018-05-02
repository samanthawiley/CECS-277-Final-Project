package project.amenities;

import project.room.MotelRoom;

public class Spa extends RoomAmenities {
    /**cost of a spa*/
    public static final double COST = 20;

    /**add a spa to a room
     */
    public Spa(MotelRoom roomType) {
        this.roomType = roomType;
    }

    /** return description of room with a spa
     */
    public String getDescription() {
        return roomType.getDescription() + " with a spa";
    }

    /** return cost of room with a spa
     */
    public double cost() {
        return roomType.cost() + COST;
    }
}
