package bookproject;

import java.util.ArrayList;

public class Fruit {
	
	public static String nameT="seema",passT="123s"; // UserName & password 
	
	public boolean b;

	public static void main(String[] args) {
		
	}


	public void Load(String name, String pass) {
		nameT=name;
		passT=pass;	
	}

	public boolean Checkpass() {
		
		b=(nameT.equalsIgnoreCase("")==false)&&(passT.equalsIgnoreCase("")==false);
		
		return (b);
	}
	public void log() {
		// TODO Auto-generated method stub
		nameT="";
		passT="";
	}
	
	public boolean Check(String string, String string2) {

		b=(nameT.equalsIgnoreCase(string))&&(passT.equalsIgnoreCase(string2));
		return (b);
		
	}


}
