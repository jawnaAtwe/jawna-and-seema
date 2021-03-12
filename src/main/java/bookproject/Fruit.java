package bookproject;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fruit {
	
	public static ArrayList<Add> bookList= new ArrayList<Add>();
	int A=0,q=0,count=0;
	public static String nameT="seema",passT="123s",n="",p=""; // UserName & password 
	public boolean b=false,c=false,ch=false,v=false;
	
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
	if(bookList.get(i).getISBN().equalsIgnoreCase(book1.getISBN())&&Checkpass()) {	
		JOptionPane.showMessageDialog(null, "This book is already added!");
		A=1;
	}
		
	}
	
	if(A==0) {
		q=0;
		count=0;
		v=Valid(book1.getISBN());
		if(v) {
		bookList.add(book1);}
		else if((v==false)&&Checkpass()) {JOptionPane.showMessageDialog(null, "invalid ISBN ! ");
		A=1;}
	} 
	}


	
	private boolean Valid(String isbn) {
		 
		for(int i=10;i>=1;i--) {
			int x=i*isbn.charAt(q);
			count+=x;
			//System.out.println(isbn.charAt(q));
			q++;
		}
		if(count%11==0) return true;
	
		else return false;
}

	public boolean booleanadd() {
		if (A==0)
		return true;
		else { 
			ch=Checkpass();
			if(ch)
				System.out.print(0);
			return false;	
	}}

	

}

