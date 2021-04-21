package bookproject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckAdd {
	
	public Add Book1;
	private Fruit fc1;
	public boolean b=false, b2=false;

	public CheckAdd(Fruit fc1) {
		this.fc1 = fc1;
	}


	@Given("the admin must have loged in")
	public void the_admin_must_have_loged_in() {
		b=fc1.checkpass();
	}

	
	@When("the admin fill ISBN {string} , title {string} , author {string} and signature {string}")
	public void the_admin_fill_isbn_title_author_and_signature
	( String ISBN, String Title, String Author, String Signature) {
		
	 Book1=new Add(ISBN, Title, Author, Signature);
	
	// else JOptionPane.showMessageDialog(null, "There is text not fill!");
		
	}


	

	
	
	@When("the admin click on add book button")
	public void the_admin_click_on_add_book_button() {
		
		//click on button to add book
	 
	}

	@Then("the book added to the library")
	public void the_book_added_to_the_library() {
		
		fc1.addbook(Book1);
		
	}

	@Then("Show a message The book was added successfully")
	public void show_a_message_the_book_was_added_successfully() {
		
		b2 = fc1.booleanadd();
		assertTrue(b&&b2); 
		//JOptionPane.showMessageDialog(null, "The book was added successfully *_^ ");
	
	  
	}
	
	@Given("the admin did not loged in")
	public void the_admin_did_not_loged_in() {
		b=fc1.checkpass();
	}
	
	
	@Then("the book will not add to the library and Show a message please Login")
	public void the_book_will_not_add_to_the_library_and_show_a_message_please_login() {
		//JOptionPane.showMessageDialog(null, "please Login ^^ ");
		assertTrue(b==false);
		
	}

	

	
}
