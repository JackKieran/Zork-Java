package characters;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import worldObjects.*;

public class character_Unit_Test {

	@Test
	public void characterTest() 
	{
		ArrayList<WorldObject> inventory = new ArrayList<WorldObject>();
		inventory.add(new Key("Red Key", "This is the Red Key"));
		
		Character paul = new Character("Paul", "This is Paul, he's here for testing purposes", 20.0f, 2.0f, 1.0f, inventory);
	
		assertEquals(paul.getName(), "Paul");
		assertEquals(paul.getBio(), "This is Paul, he's here for testing purposes");
		assertEquals(paul.getHealth(), 20.0f, 0.0f);
		assertEquals(paul.getAttack(), 2.0f, 0.0f);
		assertEquals(paul.getDefense(), 1.0f, 0.0f);
		
		assertEquals(paul.getStats()[0], 20.0f, 0.0f);
		assertEquals(paul.getStats()[1], 2.0f, 0.0f);
		assertEquals(paul.getStats()[2], 1.0f, 0.0f);
		
		assertEquals(paul.popInventory(), new Key("Red Key", "This is the Red Key"));
		assertEquals(paul.popInventory(), null);
		paul.addObjectToInventory(new Key("Red Key", "This is the Red Key"));
		assertEquals(paul.popInventory(), new Key("Red Key", "This is the Red Key"));
	}

}
