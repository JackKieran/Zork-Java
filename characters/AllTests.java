package characters;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import enemies.EnemyTest;

@RunWith(Suite.class)
@SuiteClasses({ CharacterTest.class, PlayerTest.class, EnemyTest.class })
public class AllTests {

}
