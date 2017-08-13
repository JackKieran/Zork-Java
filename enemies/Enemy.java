package enemies;

import characters.Character;

public class Enemy extends Character 
{
	private String state;
	
	public Enemy(String name, String bio, float health, float attack, float defense)
	{
		super(name, bio, health, attack, defense);
		
		if(isDead())
			this.state = "DEAD";
		
		else
			this.state = "UNAWARE";
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public boolean isDead()
	{
		return this.getHealth() <= 0;	
	}
	
	private void changeStateTo(String newState)
	{
		this.state = newState;
	}
	
	public void detectPlayer()
	{
		changeStateTo("ALERTED");
	}
	
	public void losePlayer()
	{
		changeStateTo("UNAWARE");
	}
	
	
	@Override
	public int takeDamage(float enemyDamage)
	{
		int result = super.takeDamage(enemyDamage);
		
		if(result == 1)
			changeStateTo("ALERTED");
		
		else if(result == -1)
			changeStateTo("DEAD");
		
		return result;
	}
}
