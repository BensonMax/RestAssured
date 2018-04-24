package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import restassured.GetBaidu;
import restassured.GetSina;
import restassured.GetTencent;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        GetBaidu.class,
        GetSina.class,
        GetTencent.class,
})
public class BatSuite {
}
