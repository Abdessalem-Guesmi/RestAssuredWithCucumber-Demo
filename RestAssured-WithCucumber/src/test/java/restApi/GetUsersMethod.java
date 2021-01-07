package restApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;

import io.restassured.http.ContentType;

public class GetUsersMethod {
	public static void getAllUsers(String uri) {
		baseURI = "http://localhost:3000/";
		given().headers("content-type", "application/json").contentType("Content-Type: application/json; charset=utf-8")
				.get(uri).then().statusCode(200).log().all();

	}

	public static void getOneUser(String userNumber) {
		given().headers("content-type", "application/json").contentType("Content-Type: application/json; charset=utf-8")
				.

				when().get(String.format("http://localhost:3000/users/%s", userNumber)).then()
				.body("fname", is("Mohamadov"));
	}

	public static void getOneUserWithPathParam() {
		baseURI = "http://localhost:3000/users";
		given().contentType(ContentType.JSON).with().pathParams("user", 1).when().get("{user}").then().body("fname",
				containsString("Mohamadov"));

	}

	public static void getOneUserWithQueryParam() {
		baseURI = "http://localhost:3000/users";
		given().contentType(ContentType.JSON).queryParam("id", 1).when().get().then().body("fname",
				hasItem("Mohamadov"));
	}
}
