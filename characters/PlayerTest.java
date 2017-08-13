package characters;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test() 
	{
		Player player = new Player("player_name", "player_description", 20.0f, 5.0f, 2.0f);
		assertTrue(player instanceof Character);
	}

}
