package project.room;

public class RegularRoom extends Room {
	public RegularRoom()
	{
		super();
		cost = 50;
	}
    public RegularRoom(String roomNumber) {
        super(roomNumber);
        cost = 50;
    }
}
