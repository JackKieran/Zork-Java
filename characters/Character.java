package characters;

import java.util.ArrayList;

import worldObjects.WorldObject;

/**
 * 
 * @author Jack
 *
 */
public class Character 
{
	private String name;
	private String bio;
	private float health;
	private float attack;
	private float defense;
	private ArrayList<WorldObject> inventory;
	
	public Character(String name, String bio, float health, float attack, float defence)
	{
		this(name, bio, health, attack, defence, new ArrayList<WorldObject>());
	}
	
	public Character(String name, String bio, float health, float attack, float defense, ArrayList<WorldObject> inventory)
	{
		this.name = name;
		this.bio = bio;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.inventory = inventory;
	}

	/**
	 * Returns the Character's name.
	 * @return String representing the Character's name
	 */
	public String getName() 
	{
		return this.name;
	}

	/**
	 * Returns a description of the Character.
	 * @return String representing the Character's description
	 */
	public String getBio()
	{
		return this.bio;
	}
	
	/**
	 * Returns the Character's health value.
	 * @return float representing the Character's health value
	 */
	public float getHealth()
	{
		return this.health;
	}
	
	/**
	 * Returns the Character's defense value.
	 * @return float representing the Character's attack value
	 */
	public float getAttack()
	{
		return this.attack;
	}
	
	/**
	 * Returns the Character's defense value.
	 * @return float representing the Character's defense value
	 */
	public float getDefense()
	{
		return this.defense;
	}
	
	/**
	 * Returns an array of 3 floats containing the Character's "Health, Attack, and Defense" values.
	 * 
	 * @return array of floats with a length of 3
	 */
	public float[] getStats()
	{
		return new float[]{this.health, this.attack, this.defense};
	}
	
	
	public int takeDamage(float enemyDamage)
	{
		int result = 1;
		
		float calculatedDamage = enemyDamage - this.defense;
		
		if(calculatedDamage > 0.0f)
		{
			this.health -= calculatedDamage;
			if(this.health <= 0)
				result = -1;
		}
		
		else
			result = 0;
		
		return result;
	}
	
	public int attack(Character enemy)
	{
		int result = enemy.takeDamage(this.attack);
		return result;
	}
	
	/**
	 *Returns the first WorldObject listed in the Inventory and removes it from the ArrayList.
	 * @return The WorldObject at index 0 of the Inventory
	 */
	public WorldObject popInventory()
	{
		WorldObject result = null;
		
		if(this.inventory.size() > 0)
		{
			result = this.inventory.get(0);
			this.inventory.remove(0);
		}
		
		return result;
	}
	
	/**
	 * Adds the given WorldObject to the Inventory.
	 * @param WorldObject to add to the Inventory
	 */
	public void addObjectToInventory(WorldObject object)
	{
		this.inventory.add(object);
	}
	
}
