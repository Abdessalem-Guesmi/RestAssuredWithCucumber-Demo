package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import restApi.GetUsersMethod;

public class GETUsersSteps {
	@Given("I perform Get operation for {string}")
	public void i_perform_get_operation_for(String users) {
		GetUsersMethod.getAllUsers(users);
	}

	@Then("I should see all users")
	public void i_should_see_all_users() {

	}

	@Given("I perform Get for the user number {string}")
	public void i_perform_get_for_the_user_number(String idNumber) {
		GetUsersMethod.getOneUser(idNumber);
	}

	@Then("I should see the first name as {string}")
	public void i_should_see_the_first_name_as(String string) {
	}

	@Then("I should see verify GET Query Parameter")
	public void i_should_see_verify_get_query_parameter() {
		GetUsersMethod.getOneUserWithQueryParam();
	}

	@Then("I should see verify GET Path Parameter")
	public void i_should_see_verify_get_path_parameter() {
		GetUsersMethod.getOneUserWithPathParam();
	}
}
