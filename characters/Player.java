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
}
