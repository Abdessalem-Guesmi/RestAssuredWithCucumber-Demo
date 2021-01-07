package restApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class DeleteUserMethod {
	public static void performGetRemovetUser(String id) {
		baseURI = "http://localhost:3000/users/";

		given().contentType(ContentType.JSON).with().delete(id).then().statusCode(200);

	}

}
