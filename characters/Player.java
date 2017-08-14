package characters;

public class Player extends Character 
{
	public Player(String name, String bio, float health, float attack, float defence)
	{
		super(name, bio, health, attack, defence);
	}
	
	public void pickpocket(Character target)
	{
		this.addObjectToInventory(target.popInventory());
	}
	
	public String scan(Character target)
	{
		String result = null;
		
		if(target.hasNonEmptyInventory())
			result = target.getTopOfInventory().getClass().getSimpleName();
		
		else
			result = "There is nothing in the " + target.getName() + "'s pocket";
		
		return result;
	}
}
