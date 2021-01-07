package StepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import model.Department;
import model.User;
import restApi.PostUserMethod;

public class POSTUserSteps {
	@Given("I ensure to Perform POST operatio for {string} with body as")
	public void i_ensure_to_perform_post_operatio_for_with_body_as(String users, DataTable dataTable) {

		User user = new User();
		Department department = new Department();
		user.setFname(dataTable.row(1).get(0));
		user.setLname(dataTable.row(1).get(1));
		user.setDepId(dataTable.row(1).get(2));
		PostUserMethod.addNewUser(user, users);
	}

	@Then("I should see the body with fname as {string}")
	public void i_should_see_the_body_with_fname_as(String string) {

	}
}
