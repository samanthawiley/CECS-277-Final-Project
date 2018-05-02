package project.amenities;

import project.room.MotelRoom;

public abstract class Amenity extends MotelRoom {

    protected MotelRoom room;

    public Amenity(MotelRoom room) {
        this.room = room;
    }

    public abstract double cost();

}