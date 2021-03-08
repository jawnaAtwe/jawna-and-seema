package bookproject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckAdd {
	
	public Add Book1;
	ArrayList<Add>BookList= new ArrayList<Add>();
	private Fruit fc1;
	public boolean b=false;
	public static String name="seema",pass="123s"; // Enter UserName & Password

	public CheckAdd(Fruit fc1) {
		this.fc1 = fc1;
	}
	
	@Given("the admin must have logged in")
	public void the_admin_must_have_logged_in() {
		
		b=fc1.Check(name,pass);
		
	}

	@When("the admin fill ISBN {string} , title {string} , author {string} and signature {string}")
	public void the_admin_fill_isbn_title_author_and_signature
	( String ISBN, String Title, String Author, String Signature) {
		
		if((ISBN.equalsIgnoreCase("")&&Title.equalsIgnoreCase("")&&Author.equalsIgnoreCase("")
				&&Signature.equalsIgnoreCase(""))==false) {

		Book1 =new Add(ISBN,Title,Author,Signature);
		}
		
		else JOptionPane.showMessageDialog(null, "There is text not fill!");
		
	}
	
	@When("the admin click on add book button")
	public void the_admin_click_on_add_book_button() {
		
		//click on button to add book
	 
	}

	@Then("the book added to the library")
	public void the_book_added_to_the_library() {
		
		BookList.add(Book1);
		
		for (int p=0;p<BookList.size();p++) {     
		  System.out.println(BookList.get(p).getISBN()+" \t"+BookList.get(p).getTitle()+"\t \t"
			+BookList.get(p).getAuthor()+"\t  \t"+BookList.get(p).getSignature());
		}
	}

	@Then("Show a message The book was added successfully")
	public void show_a_message_the_book_was_added_successfully() {
			
		assertTrue(b); 
		JOptionPane.showMessageDialog(null, "The book was added successfully *_^ ");
	
	  
	}
	
	@Given("the admin did not logged in")
	public void the_admin_did_not_logged_in() {
		
		b=fc1.Check(name,pass);
		
	}
	
	@Then("the book will not add to the library")
	public void the_book_will_not_add_to_the_library() {
		
		assertTrue(!b);
	   
	}


	@Then("Show a message please Login")
	public void show_a_message_please_login() {
		
		JOptionPane.showMessageDialog(null, "please Login ^^ ");
	   
	}

	
}
