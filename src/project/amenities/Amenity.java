package project.amenities;

import project.room.Room;

public abstract class Amenity extends Room {

    protected Room room;

    public Amenity(Room room) {
        this.room = room;
    }

    public abstract double getRate();

    @Override
    public String getRoomNumber() {
        return room.getRoomNumber();
    }
}