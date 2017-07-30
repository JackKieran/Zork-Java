package worldObjects;

public class WorldObject 
{
	private String name;
	private String description;
	private float weight;
	private float value;
	
	public WorldObject(String name, String description, float weight, float value)
	{
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.value = value;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public float getWeight()
	{
		return this.weight;
	}
	
	public float getValue()
	{
		return this.value;
	}
}
