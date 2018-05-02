package project.amenities;

public abstract class RoomAmenities extends MotelRoom{
    /**return description of Motel Room*/
    public abstract String getDescription();

    /**Room held by the Amenity*/
    protected MotelRoom roomType;

    public RoachColony getGuest() {
        return roomType.getGuest();
    }

    public abstract double cost();
}