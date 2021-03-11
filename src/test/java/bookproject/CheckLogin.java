package bookproject;

import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLogin {
	
	public static String name,pass;
	public boolean b; 
	private Fruit fc;
	
	public CheckLogin(Fruit fc) {
		this.fc=fc;
	}
	
	@When("admain fill {string} and {string}")
	public void admain_fill_and(String name1, String pass1) {
		
		pass=pass1;
		name=name1;
	}

	@Given("admain want to login to the application")
	public void admain_want_to_login_to_the_application() { 
	
	}
	
	@When("admain fill strings")
	public void admain_fill_strings() {
	    
	}


	@When("admain click login button and it is valid")
	public void admain_click_login_button_and_it_is_valid() {
		
		b=fc.Check(name, pass);
		
	}

	@Then("admain should be loged in and open next page")
	public void admain_should_be_loged_in_and_open_next_page() {
		assertTrue(b);
		JOptionPane.showMessageDialog(null, "LOGIn Done");
		 
	}

	
	@When("admain click login button and it is invalid")
	public void admain_click_login_button_and_it_is_invalid() {
		
		b=fc.Check(name, pass);
	   
	}

	@Then("admain should not be loged in")
	public void admain_should_not_be_loged_in() {
		
		 assertTrue(!b);
	   
	}

	@Then("Show a message invalid password")
	public void show_a_message_invalid_password() {
		
		JOptionPane.showMessageDialog(null, "Invalid Password!!");
	   
	}

	@Then("clear password")
	public void clear_password() {
		
		//clean textfield  for password
		
	}



}



