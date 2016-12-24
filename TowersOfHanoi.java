
import java.util.Scanner;
public class TowersOfHanoi{
	static Scanner input = new Scanner(System.in); //input
	static int disks;	 //disks from user
	public static int theTower(int disks,String pole, String pole2, String pole3){ //model ex. have disks have 3
		//method takes in the amount of disks, and visual off movement form the three diferent poles
		  if (disks == 1) {
	           System.out.println(pole + " Moves to " + pole3); //always last move
	       } else { //
	           theTower(disks - 1, pole, pole3, pole2); //recursive method
	           System.out.println(pole + " Moves to " + pole3); //output to show movement
	           theTower(disks - 1, pole2, pole, pole3); //recursive method, disks decrease 
	       }
		  return disks;
	}
	
	public static void main(String[]args){
		System.out.println("Welcome to Towers of Hanoi! \nEnter Number of Disks to Start: ");
		disks = input.nextInt();
		theTower(disks,"First", "Second", "Third"); //call to main
	}
}
