package restApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.restassured.http.ContentType;
import model.User;

public class PostUserMethod {
	public static void performGetNewUser(String fname) {
		baseURI = "http://localhost:3000/";
		given().headers("content-type", "application/json").contentType("Content-Type: application/json; charset=utf-8")
				.accept(ContentType.JSON).when().get(("users/3")).then().body(fname, is("Rest-Assured")).statusCode(400)
				.log().all();

	}

	public static void addNewUser(User user, String users) {
		baseURI = "http://localhost:3000/";

		given().contentType(ContentType.JSON).with().body(user).when().post(users);
	}
}
