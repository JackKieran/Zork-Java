package worldObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class world_Objects_Unit_Test 
{

	@Test
	public void worldObjectTest() 
	{
		WorldObject wO = new WorldObject("name", "description", 10.0f, 3.0f);
		
		assertEquals(wO.getName(), "name");
		assertEquals(wO.getDescription(), "description");
		assertTrue(wO.getWeight() == 10.0f);
		assertTrue(wO.getValue() == 3.0f);
	}

	@Test
	public void keyTest()
	{
		Key key = new Key("red", "This key is red");
		
		assertEquals(key.getClass().getSuperclass().getSimpleName(), "WorldObject");
	}
}
