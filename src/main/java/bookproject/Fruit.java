package bookproject;

import java.util.ArrayList;
import java.util.List;



public class Fruit {
	
	protected static final List<Add> bookList= new ArrayList<>();
	 int a=0;
	int  q=0;
	int count=0;
	public static final String NAMET="seema";
	public static final String PASST="123s";
	  static  String n="";
	  static  String p=""; // UserName & password 
	 static boolean b=false;
	 boolean c=false;
	 boolean v=false;
	
	public static  boolean check(String string, String string2) {

		b=(NAMET.equalsIgnoreCase( string))&&(PASST.equalsIgnoreCase(string2));
		
			if(b) {           //save logIn information
				n=string;
			    p=string2;}
		
		return (b);
		
	}
	
	public boolean checkpass() {
		c=((n.equalsIgnoreCase(NAMET))&&(p.equalsIgnoreCase(PASST)));
		return (c);
	}
	
public void addbook(Add book1) {
		
		a=0;
	include(book1);
	
	addIfValid(book1); 
	
	
	}

private void addIfValid(Add book1) {
	if(a==0) {
		q=0;
		count=0;
		v=valid(book1.getISBN());
		if(v) {
		bookList.add(book1);}
		else if(checkpass()) {	
		a=1;
		}
	}
}

private void include(Add book1) {
	for(int i=0;i<bookList.size();i++) {
	if(bookList.get(i).getISBN().equalsIgnoreCase(book1.getISBN())&&checkpass()) {	
		
		a=1;
	}
		
	}
}       


	
	private boolean valid(String isbn) {
		 
		for(int i=10;i>=1;i--) {
			int x=i*isbn.charAt(q);
			count+=x;
			
			q++;
		}
		
		return val();
}

	private boolean val() {
		boolean co;
		if(count%11==0) co=true;
	
		else co=false;
		return co;
	}

	public boolean booleanadd() {
		boolean co;
		if (a==0) {
		co=true;
		}
		else  co=false;
			
			return co;	
	}}

	



