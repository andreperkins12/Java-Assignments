import java.util.HashMap;

import java.util.Scanner;
import java.util.Random;
//Complete BRUTE FORCE
public class ch3Num8 {
	Random rando = new Random(); //Random number generator
	String phrase = "Too Too Too = Good"; // phrase
	int t = rando.nextInt(9); //random number 
	int o = rando.nextInt(9); //
	int g = rando.nextInt(9);//
	int d = rando.nextInt(9); //^^ all same as above

	public void phrase (){ //
			if(t == o || t == g || t == d){ //checks to see that it is unique
			t = rando.nextInt(9);
		} if ( o == t || o == g || o == d){
			o = rando.nextInt(9);
		}if ( g == t || g == o || o == d){
			g = rando.nextInt(9);
		} if ( d == t || d == o || d == g){  //same as above with other variables 
			d = rando.nextInt(9);
		}
	
		System.out.println(phrase); //prints out output
	System.out.println(t + "" + o + o + " " +  t + o + o + " " +  t + o + o + " = " + g + o + o + d); //Brute Forced Output
			
	}
	public static void main(String[] args) {
	
		ch3Num8 method = new ch3Num8(); //called to main
		method.phrase();
	
	
	
	
	}

}
