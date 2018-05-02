public class AmenitiesFactory {
    private AmenitiesFactory() {}

    public static RoomAmenities getAmenity(String type, MotelRoom roomType) throws InvalidAmenityException {
        if (type.equalsIgnoreCase("shower")) return new Shower(roomType);
        else if (type.equalsIgnoreCase("spa")) return new Spa(roomType);
        else if (type.equalsIgnoreCase("food bar")) return new FoodBar(roomType);
        else if (type.equalsIgnoreCase("auto refill")) return new AutoRefill(roomType);
        else throw new InvalidAmenityException(type);
    }
}