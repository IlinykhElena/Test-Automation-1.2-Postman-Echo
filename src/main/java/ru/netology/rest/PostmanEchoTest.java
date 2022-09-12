package ru.netology.rest;

import org.testng.annotations.Test;

import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.given;



public class PostmanEchoTest {
    @Test
    public void shouldTestPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
