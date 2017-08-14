package enemies;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnemyUnitTest 
{
	@Test
	public void takeDamageStateUnchanged()
	{
		Enemy stateUnchanged = new Enemy("Unchanged", "Enemy to test state unchanged from taking 0 damage", 3.0f, 0.0f, 0.0f);
		
		assertEquals("UNAWARE", stateUnchanged.getState());
		
		stateUnchanged.takeDamage(0.0f);
		assertEquals("UNAWARE", stateUnchanged.getState());
	}
	
	@Test
	public void takeDamageStateUnawareToAlerted() 
	{
		Enemy stateUnawareToAlerted = new Enemy("UnawareToAlerted", "Enemy to test state change from UNAWARE to ALERTED via taking damage", 3.0f, 0.0f, 0.0f);
		
		assertEquals("UNAWARE", stateUnawareToAlerted.getState());
		
		stateUnawareToAlerted.takeDamage(1.0f);
		assertEquals("ALERTED", stateUnawareToAlerted.getState());
	}

	@Test
	public void takeDamageStateUnawareToDead()
	{
		Enemy stateUnawareToDead = new Enemy("UnawareToDead", "Enemy to test state change from UNAWARE to DEAD via taking damage", 3.0f, 0.0f, 0.0f);
		
		assertEquals("UNAWARE", stateUnawareToDead.getState());
		
		stateUnawareToDead.takeDamage(3.0f);
		assertEquals("DEAD", stateUnawareToDead.getState());
	}
	
	
	@Test
	public void stateDeadOnConstruction()
	{
		Enemy stateDeadOnConstruction = new Enemy("DeadOnConstruction", "Enemy to test state when constructed with 0 health", 0.0f, 0.0f, 0.0f);
		assertEquals("DEAD", stateDeadOnConstruction.getState());
	}
}
