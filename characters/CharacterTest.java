package characters;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import enemies.Enemy;
import worldObjects.*;

public class CharacterTest 
{
	@Test
	public void popInventoryWithout()
	{
		Character withoutInventory = new Character("without", "Character without an inventory", 1.0f, 1.0f, 1.0f);
		
		assertEquals(null, withoutInventory.popInventory());
	}
	
	@Test
	public void popInventoryWithEmpty()
	{
		ArrayList<WorldObject> inventory = new ArrayList<WorldObject>();
		Character withEmptyInventory = new Character("withEmpty", "Character with an empty inventory", 1.0f, 1.0f, 1.0f, inventory);
		
		assertEquals(null, withEmptyInventory.popInventory());
	}
	
	@Test
	public void popInventoryWithFilled()
	{
		WorldObject worldObject = new WorldObject("worldObject", "worldObject in inventory", 1.0f, 1.0f);
		ArrayList<WorldObject> inventory = new ArrayList<WorldObject>();
		inventory.add(worldObject);
		Character withFilledInventory = new Character("withFilled", "Character with a filled inventory", 1.0f, 1.0f, 1.0f, inventory);
	
		assertEquals(worldObject, withFilledInventory.popInventory());
		assertEquals(null, withFilledInventory.popInventory());
	}
	
	@Test
	public void popInventoryAddedTo()
	{
		ArrayList<WorldObject> inventory = new ArrayList<WorldObject>();
		Character addedToInventory = new Character("addedTo", "Character with an inventory added to", 1.0f, 1.0f, 1.0f, inventory);
		WorldObject worldObject = new WorldObject("worldObject", "worldObject to add to inventory", 1.0f, 1.0f);
		addedToInventory.addObjectToInventory(worldObject);
		
		assertEquals(worldObject, addedToInventory.popInventory());
		assertEquals(null, addedToInventory.popInventory());
	}
	
	
	@Test
	public void takeDamageLessThanHealth()
	{
		Character takingDamageLessThanHealth = new Character("takingDamageLessThanHealth", "Character taking damage less than the health value", 10.0f, 0.0f, 0.0f);
		
		assertEquals(1, takingDamageLessThanHealth.takeDamage(5.0f));
	}
	
	@Test
	public void takeDamageNoDamage()
	{
		Character takingNonFatalDamageNoDefense = new Character("takingDamageNoDamage", "Character taking 0 damage", 10.0f, 0.0f, 0.0f);
		
		assertEquals(0, takingNonFatalDamageNoDefense.takeDamage(0.0f));
	}
	
	@Test
	public void takeDamageLowerThanDefense()
	{
		Character takingNonFatalDamageNoDefense = new Character("takingDamageLowerThanDefense", "Character taking damage lower than the defense value", 10.0f, 0.0f, 7.0f);
		
		assertEquals(0, takingNonFatalDamageNoDefense.takeDamage(3.0f));
	}
	
	@Test
	public void takeDamageEqualToDefense()
	{
		Character takingDamageEqualToDefense = new Character("takingDamageEqualToDefense", "Character taking damage equal the defense value", 10.0f, 0.0f, 7.0f);
		
		assertEquals(0, takingDamageEqualToDefense.takeDamage(7.0f));
	}
	
	@Test
	public void takeDamageEqualToHealth()
	{
		Character takingDamageEqualToHealth = new Character("takingDamageEqualToHealth", "Character taking damage equal to the Health value", 10.0f, 0.0f, 0.0f);
		
		assertEquals(-1, takingDamageEqualToHealth.takeDamage(10.0f));
	}
	
	@Test
	public void takeDamageGreaterThanHealth()
	{
		Character takingDamageGreaterThanHealth = new Character("takingDamagegreater than Health", "Character taking damage greater than the Health value", 10.0f, 0.0f, 0.0f);
		
		assertEquals(-1, takingDamageGreaterThanHealth.takeDamage(20.0f));
	}
}
