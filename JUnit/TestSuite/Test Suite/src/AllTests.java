import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCasesConcat.class, TestCasesSort.class, TestCasesCheckPresence.class})
public class AllTests {

}
