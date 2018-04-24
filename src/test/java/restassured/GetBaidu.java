package restassured;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
public class GetBaidu {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("before class only run one time");
    }

    @Before
    public void before(){
        useRelaxedHTTPSValidation();
    }

    @Test
    public void getBaidu(){
        given()
                .when()
                .get("https://www.baidu.com").prettyPeek()
                .then()
                .statusCode(200);
    }
}
