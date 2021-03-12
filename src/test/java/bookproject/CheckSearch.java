package bookproject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckSearch {
	
	public  static String name="jawna",pass="123"; //enter pass and name here
	
	private Fruit fc1;

	public boolean P1=true;
        
		
		public CheckSearch( Fruit fc1) {
			this.fc1 = fc1;
			}
	DataTable data;
	public boolean Psub=false;
	
	public int m=0;
	List<Map<String,String>> userList;
	
	public List<String> login= new ArrayList();
	public List<String> title= new ArrayList();
	public List<String> isbn= new ArrayList();
	public List<String> author= new ArrayList();
	
	@Given("these books was added by admin in the library")
	public void these_books_was_added_by_admin_in_the_library(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	  
		
		userList=  dataTable.asMaps(String.class, String.class);
	    
		
	    
	}

	@Given("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
	    	
		P1=fc1.Checkpass();	
		
		
	}

	@When("they search for the substring of title {string}")
	public void they_search_for_the_substring_of_title(String string) {
		
		Psub=false;
		if(!P1) {
		for(Map<String,String> m:userList) {
			
		Psub=m.get("title").contains(string);
		if(Psub) {
			
			
			title.add(m.get("signature"));
            System.out.println(m.get("signature"));
		}
		
			
		}	
		}}
	
	@Then("they find the book has a signature T {string}")
	public void they_find_the_book_has_a_signature_t(String string) {
		Psub=false;
		
		for(String T:title) {
		Psub=T.equalsIgnoreCase(string);
			if(Psub)
				{System.out.println(T);
			break;}
		}
		assertTrue(Psub);
		
	}
	

	@When("they search for the substring of author {string}")
	public void they_search_for_the_substring_of_author(String string) {
		Psub=false;
		if(!P1) {
		for(Map<String,String> m:userList) {
			
			Psub=m.get("author").contains(string);
			if(Psub) {
				
				author.add(m.get("signature"));
				System.out.println(m.get("signature"));
			}
			
				
			}
			
		
		
		
	    	}}
	
	
	@Then("they find the book has a signature A {string}")
	public void they_find_the_book_has_a_signature_a(String string) {
	
		
		Psub=false;
		for(String T:author) {
		Psub=T.equalsIgnoreCase(string);
			if(Psub)
				{System.out.println(T);
			break;}
		}
		assertTrue(Psub);
		
		
		
		
	}

	@When("they search for the substring of isbn {string}")
	public void they_search_for_the_substring_of_isbn(String string) {
		Psub=false;
		if(!P1) {
		for(Map<String,String> m:userList) {
			
			Psub=m.get("isbn").contains(string);
			if(Psub) {
				
				isbn.add(m.get("signature"));
				System.out.println(m.get("signature"));
			}
			
				
			}
			
		
		
	}}
	
	

	

	@Then("they find the book has a signature I {string}")
	public void they_find_the_book_has_a_signature_i(String string) {
		Psub=false;
		for(String T:isbn) {
		Psub=T.equalsIgnoreCase(string);
			if(Psub)
				{System.out.println(T);
			break;}
		}
		assertTrue(Psub);
		
			
	}

	
	
	
	@When("they search for the substring {string}")
	public void they_search_for_the_substring(String string) {
		
		Psub=false;
	    if(P1) {
	    	for(Map<String,String> m:userList) {
	    		Psub=m.get("isbn").contains(string);
	    		if(Psub) {
	    			login.add(m.get("signature"));
	    			
	    		
	    		}
	    		else {
	    		Psub=m.get("title").contains(string);
	    		if(Psub) {
	    			login.add(m.get("signature"));
	    			
	    			
	    		}
	    		else {
	    		Psub=m.get("author").contains(string);
	    		if(Psub) {
	    			login.add(m.get("signature"));
	    			
	    		
	    		}
	    		
	    		
	    		
	    		
	    		
	    	}}}}}

	
	
	@Then("they find the book has a signature {string}")
	public void they_find_the_book_has_a_signature(String string) {
		
		
		Psub=false;
		for(String T:login) {
		Psub=T.equalsIgnoreCase(string);
			if(Psub)
				{System.out.println(T);
			break;
			}
		}
		assertTrue(Psub);
	
	}
	
	

	@Given("the admin is  logged in")
	public void the_admin_is_logged_in() {
		
		P1=fc1.Checkpass();
	    
	}

	
	@Then("show a Message there is not any thing with this substring")
	public void show_a_message_there_is_not_any_thing_with_this_substring() {
	    Psub=false;
		if( login.isEmpty())
			Psub=true;
		
		assertTrue(Psub);
	
	}
	
	

	@Then("they find the book has a signature {string} and {string}")
	public void they_find_the_book_has_a_signature_and(String string, String string2) {
	 
		Psub=false;
		P1=false;
		for(String t: login) {
			
			Psub=(t.equalsIgnoreCase(string) || t.equalsIgnoreCase(string2));
			if(Psub) {
				P1=true;
				System.out.println(t);
			}
			
		} assertTrue(P1);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
