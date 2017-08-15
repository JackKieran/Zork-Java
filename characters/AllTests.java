package characters;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import enemies.EnemyUnitTest;

@RunWith(Suite.class)
@SuiteClasses({ CharacterUnitTest.class, EnemyUnitTest.class, PlayerIntegrationTest.class })
public class AllTests {}