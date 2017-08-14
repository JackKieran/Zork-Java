package characters;

import static org.junit.Assert.*;

import org.junit.Test;

import worldObjects.WorldObject;

public class PlayerIntegrationTest 
{
	@Test
	public void pickpocketEmptyTest()
	{
		Player player = new Player("Player", "for testing purposes", 20.0f, 0.0f, 0.0f);
		Character pickpocketTargetEmptyInventory = new Character("Target", "for testing purposes", 20.0f, 0.0f, 0.0f);
		
		player.pickpocket(pickpocketTargetEmptyInventory);
		
		assertEquals(null, player.getTopOfInventory());
	}
	
	@Test
	public void pickpocketNonEmptyTest() 
	{
		Player player = new Player("Player", "for testing purposes", 20.0f, 0.0f, 0.0f);
		Character pickpocketTargetNonEmptyInventory = new Character("Target", "for testing purposes", 20.0f, 0.0f, 0.0f);
		
		WorldObject object = new WorldObject("Object", "for testing purposes", 1.0f, 1.0f);
		pickpocketTargetNonEmptyInventory.addObjectToInventory(object);
		
		player.pickpocket(pickpocketTargetNonEmptyInventory);
		
		assertEquals(object, player.getTopOfInventory());
	}
	
	@Test
	public void scanTest()
	{
		Player player = new Player("Player", "for testing purposes", 20.0f, 0.0f, 0.0f);
		Character scanTarget = new Character("Target", "for testing purposes", 20.0f, 0.0f, 0.0f);
	
		WorldObject object = new WorldObject("Object", "for testing purposes", 1.0f, 1.0f);
		scanTarget.addObjectToInventory(object);
		
		assertEquals("WorldObject", player.scan(scanTarget));
	}
}
