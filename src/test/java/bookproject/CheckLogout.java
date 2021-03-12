package bookproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLogout {
	
	
private Fruit1 fc1;

public boolean P1;

	
	public CheckLogout(Fruit1 fc1) {
		this.fc1 = fc1;
		}
	
	
	@Given("the user must have loged in to the application")
	public void the_user_must_have_loged_in_to_the_application() {
		P1= fc1.Checkpass();
	}

	@When("user enters on log out")
	public void user_enters_on_log_out() {
	   
	}

	@Then("user should be loged out from application")
	public void user_should_be_loged_out_from_application() {
		
		
		
		if(!P1)
			assertTrue(P1);   
	}

	@Then("Message displayed log out successfully")
	public void message_displayed_log_out_successfully() {
	fc1.log();
	}

}
