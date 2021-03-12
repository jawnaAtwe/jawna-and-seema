package bookproject;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fruit {
	
	public static ArrayList<Add> bookList= new ArrayList<Add>();
	int A=0;
	public static String nameT="seema",passT="123s",n="",p=""; // UserName & password 
	public boolean b=false,c=false,ch=false;
	
	public static void main(String[] args) {
		
	}

	public boolean Check(String string, String string2) {

		b=(nameT.equalsIgnoreCase(string))&&(passT.equalsIgnoreCase(string2));
		
			if(b) {           //save logIn information
				n=string;
			    p=string2;}
		
		return (b);
		
	}
	
	public boolean Checkpass() {
		c=((n.equalsIgnoreCase(nameT))&&(p.equalsIgnoreCase(passT)));
		return (c);
	}
	
public void addbook(Add book1) {
		
		A=0;
	for(int i=0;i<bookList.size();i++) {
	if(bookList.get(i).getISBN().equalsIgnoreCase(book1.getISBN())) {	
		
		A=1;
	}
		
	}
	
	if(A==0)
		bookList.add(book1);
	}


	
	public boolean booleanadd() {
		if (A==0)
		return true;
		else {
			ch=Checkpass();
			if(ch)
			JOptionPane.showMessageDialog(null, "This book is already added!");
			return false;	
	}}

	

}

