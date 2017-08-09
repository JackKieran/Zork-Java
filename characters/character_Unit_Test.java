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
		
		assertEquals(paul.takeDamage(10.0f), 1);
		assertEquals(paul.getHealth(), 11.0f, 0.0f);
		assertEquals(paul.takeDamage(0.0f), 0);
		assertEquals(paul.takeDamage(12.0f), -1);
		
		Character attackTarget = new Character("Dummy Target", "Dummy Target for practicing attacking", 10.0f, 0.0f, 0.0f);
		assertEquals(paul.attack(attackTarget), 1);
		assertEquals(attackTarget.attack(paul), 0);
	}

	@Test
	public void playerTest()
	{
		Player player = new Player("player_name", "player_description", 20.0f, 5.0f, 2.0f);
		assertTrue(player instanceof Character);

		Character target = new Character("target", "Pickpocket target", 10.0f, 1.0f, 0.0f);
		target.addObjectToInventory(new Key("Red Key", "This is the Red Key"));
		assertEquals(player.popInventory(), null);
		player.pickpocket(target);
		assertEquals(player.popInventory(), new Key("Red Key", "This is the Red Key"));
	}
	
}
