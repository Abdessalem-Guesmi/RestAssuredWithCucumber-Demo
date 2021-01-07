package StepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import restApi.DeleteUserMethod;

public class DELETEUserSteps {

	@Given("I Perform DELETE operation for {string}")
	public void i_perform_delete_operation_for(String idNumber, DataTable dataTable) {
		idNumber = dataTable.row(1).get(0);
		DeleteUserMethod.performGetRemovetUser(idNumber);
	}

	@Given("I Perform GET operation with path parameter for {string}")
	public void i_perform_get_operation_with_path_parameter_for(String idNumber, DataTable dataTable) {

	}

	@Then("I should not see the body with fname as {string}")
	public void i_should_not_see_the_body_with_fname_as(String string) {

	}

}
