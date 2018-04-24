package suite;

import junitdemo.Test1;
import junitdemo.Test2;
import junitdemo.Test3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class,
        Test2.class,
        Test3.class
})
public class DemoTestSuite {
}
