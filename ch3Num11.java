import java.util.Random; //Random Number Generator
public class ch3Num11 {
//COMPLETE
	public static void main(String[] args) {
		Random rando = new Random();  //random
		int firstN = rando.nextInt(30);  //first random number with boundaries of 30 
		int secondN = rando.nextInt(30);
		int thirdN = rando.nextInt(30); // same as above
		
		if( firstN == secondN || firstN == thirdN){ //if a number is equal to eachother
			secondN = rando.nextInt(30); //have the number set to another random number 
			thirdN = rando.nextInt(30); //same as above 
			System.out.println("Winners are: "  + firstN + ' ' + secondN + " " + thirdN ); //print out 
			
		}else {
		System.out.println("Winners are: "  + firstN + ' ' + secondN + " " + thirdN ); //if they arent equal just print out the number 
	}
}
	

}
