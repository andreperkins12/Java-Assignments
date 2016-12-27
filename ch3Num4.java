import java.util.Scanner;

public class ch3Num4 {
//complete
	public static void main(String[] args) {
		double pencilPrice = .99; //price of pencisl 
		Scanner input = new Scanner(System.in); //scanner input 
		
		System.out.println("Enter Inflation Rate(Ex: 5.6 %) \nNumber of Years in Advance \nHow many do you want to order($.99) : ");
		double inflation = input.nextDouble() * .01; //input of inflation
		int year = input.nextInt(); //input year
		int quantity = input.nextInt(); //amount of pencils
		
		double percentage = inflation * year;  //inflation percentage over the amount of years 
		double price = percentage * (pencilPrice * quantity); //price of with inflation year and q
		
		System.out.println("Calculate enter (Y/N) : "); //prompt to calcualte
		String contin = input.next();
		 //input 
		while(contin.equalsIgnoreCase("Y") != true); {
			System.out.println("The Price in " + year + " years is " + price); //output
			
			}
			
			}

		}
		

	


