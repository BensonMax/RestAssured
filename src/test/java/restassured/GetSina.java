package restassured;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSina {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("before class only run one time");
    }

    @Before
    public void before(){
        System.out.println("this is sina before");
    }

    @Test
    public void getSina(){
        given()
                .when()
                .get("http://www.sina.com.cn").prettyPeek()
                .then()
                .statusCode(200);
    }
}
