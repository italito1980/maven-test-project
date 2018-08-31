package com.mytests.maven.testng.restapi.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GoogleSearchPlacesTest {

//	@Test
//	public void searchPlaces() {
//		RestAssured.baseURI = "https://maps.googleapis.com";
//		
//		RequestSpecification request = RestAssured.given();
//		
//		request.param("key", "AIzaSyD7QwpiVOJVWLRtx9Org36_LYG6S43fYVU");
//		request.param("input", "Catedral de Sal");
//		request.param("inputtype", "textquery");
//        Response response = request.when().get("/maps/api/place/findplacefromtext/json");
//		
//		System.out.println(response.then().extract().asString());
//		
//	}
	
	@Test
	public void searchPlaces() {
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		given()
		.param("key", "AIzaSyD7QwpiVOJVWLRtx9Org36_LYG6S43fYVU")
		.param("input", "Catedral de Sal")
		.param("inputtype", "textquery")
		.when()
		.get("/maps/api/place/findplacefromtext/json").jsonPath().get("candidates[0].place_id").equals("ChIJAXt7UCBwQI4RfyOsloFI3wA");
//		.then().assertThat().contentType(ContentType.JSON).and().statusCode(200)
//		.and().body("candidates[0].place_id", equalTo("ChIJAXt7UCBwQI4RfyOsloFI3wA"))
//		.and().body(, equalTo("OK"));
	}
}
