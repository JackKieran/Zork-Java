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
	
	
	@Override
	public boolean equals(Object obj)
	{
		boolean result = true;
		
		if(obj == null)
			result = false;
		
		else if(!(WorldObject.class.isAssignableFrom(obj.getClass())))
			result = false;
		
		else
		{
			final WorldObject that = (WorldObject) obj;
			
			result = result || this.name.equals(that.name);
			result = result || this.description.equals(that.description);
			result = result || this.weight == that.weight;
			result = result || this.value == that.value;
		}
		
		return result;
	}
	
	@Override
	public int hashCode()
	{
		int result = 0;
		
		for(char character : this.name.toCharArray())
		{
			result += (int) character;
		}
		
		for(char character : this.description.toCharArray())
		{
			result += (int) character;
		}
		
		result += (int)this.weight;
		
		result += (int)this.value;
		
		
		return result;
	}
	
	@Override
	public WorldObject clone()
	{
		return new WorldObject(this.name, this.description, this.weight, this.value);
	}
}
