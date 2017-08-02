package characters;

import java.util.ArrayList;

import worldObjects.WorldObject;

public class Character 
{
	private String name;
	private String bio;
	private float health;
	private float attack;
	private float defense;
	private ArrayList<WorldObject> inventory;
	
	public Character(String name, String bio, float health, float attack, float defense, ArrayList<WorldObject> inventory)
	{
		this.name = name;
		this.bio = bio;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.inventory = inventory;
	}

	
	public String getName() 
	{
		return this.name;
	}

	public String getBio()
	{
		return this.bio;
	}
	
	public float getHealth()
	{
		return this.health;
	}
	
	public float getAttack()
	{
		return this.attack;
	}
	
	public float getDefense()
	{
		return this.defense;
	}
	
	public float[] getStats()
	{
		return new float[]{this.health, this.attack, this.defense};
	}
}
