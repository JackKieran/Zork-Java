package rooms;

import static org.junit.Assert.*;

import org.junit.Test;

public class rooms_Unit_Tests 
{

	@Test
	public void unlockedExitTest()
	{
		Room exitingRoom = new Room("exitingRoom", "Testing the exits");
		
		Exit testExit = new Exit(exitingRoom);
		
		assertEquals(testExit.getExitDescription(), "Testing the exits");
		assertEquals(testExit.isLocked(), false);
	}
	
	@Test
	public void roomTest() 
	{
		Room testRoom = new Room("Hall", "Room for test purposes");
		
		assertEquals(testRoom.getName(), "Hall");
		assertEquals(testRoom.getDescription(), "Room for test purposes");
	}

}
