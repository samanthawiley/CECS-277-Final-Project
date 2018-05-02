package project.amenities;

public class InvalidAmenityException extends java.lang.Exception {
    public InvalidAmenityException(String type) {
        super("Amenity type: " + type + " does not exist.");
    }
}