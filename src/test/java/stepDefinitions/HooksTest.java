package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksTest {
	
	@Before
	public void setUp()
    {
        System.out.println("Launching Browser");
        System.out.println("Login into  Application");
    }
	
	@After
	public void endTest()
    {
        System.out.println("Ending the test");
    }
	
	@Given("On some page")
	public void on_some_page() {
	    System.out.println("On some page");
	}

	@When("Add some user")
	public void add_some_user() {
		System.out.println("Adding user");
	}

	@Then("User is added")
	public void user_is_added() {
		System.out.println("User Added");
	}

	@When("Search for the existing user")
	public void search_for_the_existing_user() {
		System.out.println("Searching for the user");
	}

	@When("Edit some user")
	public void edit_some_user() {
		System.out.println("Edit User");
	}

	@Then("User is edited")
	public void user_is_edited() {
		System.out.println("User edited");
	}

	@When("Delete some user")
	public void delete_some_user() {
		System.out.println("Delete user");
	}

	@Then("User is deleted")
	public void user_is_deleted() {
		System.out.println("user deleted");
	}

}
