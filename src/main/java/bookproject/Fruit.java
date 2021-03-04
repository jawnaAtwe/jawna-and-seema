package bookproject;

import java.util.ArrayList;

public class Fruit {
	
	
	
	public static String nameT="",passT="";
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


}
