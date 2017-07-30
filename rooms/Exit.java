package rooms;

public class Exit 
{
	private Room exitRoom;
	private boolean isLocked;
	
	public Exit(Room exitRoom)
	{
		this.exitRoom = exitRoom;
	}
	
	
	public String getExitDescription()
	{
		return this.exitRoom.getDescription();
	}
	
	public boolean isLocked()
	{
		return this.isLocked;
	}
}
