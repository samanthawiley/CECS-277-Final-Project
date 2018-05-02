package project.amenities;

import project.room.Room;

public abstract class Amenity extends Room {

    protected Room room;

    public Amenity(Room room) {
        this.room = room;
    }

    public abstract double cost();

    @Override
    public String getRoomNumber() {
        return room.getRoomNumber();
    }
}