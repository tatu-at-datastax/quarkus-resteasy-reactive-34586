package com.datastax.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PathResourceTest {
    @BeforeAll
    public static void init() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void pathAsList() {
        given()
          .when().get("/path/list/{seg1}/{seg2}", "key/1", "key/2")
          .then()
          .statusCode(200)
          .body(is("Path(2): [key/1, key/2]"));
    }
}
