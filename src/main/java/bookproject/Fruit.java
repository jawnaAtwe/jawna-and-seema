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

	

}

