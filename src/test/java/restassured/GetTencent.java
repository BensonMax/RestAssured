package restassured;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

public class GetTencent {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("before class only run one time");
    }

    @Before
    public void before(){
        System.out.println("this is tencent before");
    }

    @Test
    public void getTencent(){
        given()
                .when()
                .get("http://www.qq.com").prettyPeek()
                .then()
                .statusCode(200);
    }
}
