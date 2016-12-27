import java.util.Scanner;
import java.text.*;
//Need Loop so user can enter new values
public class ch3Num3 {
	DecimalFormat df = new DecimalFormat("0.00"); //decimalformat
	Scanner input = new Scanner(System.in); //input 
	int length;
	
	public void firstInput (){
		System.out.println("Enter Mother's Height(Inches): " ); //input of the mothers height in inches
		double momH = input.nextInt(); //double var holding input
		System.out.println("Enter Fathers Height(Inches): "); //same as above
		double dadH = input.nextInt();
		
		double maleKid = ((momH * 13/12) + dadH)/2;  //male kid conversion
		double femaleKid = ((dadH * 12/13) + momH)/2; //girl conversion
		
		System.out.println("Your boy would be: " + df.format(maleKid) +" inches" + "\n"
				+ "Your girl would be: " + df.format(femaleKid) + " inches"); //output 
		
		
		
	
	
		}
		
	public void feetInches (){
		
		
		while(length < 100000000){ //while lopp that practically goes on forever until the end it 
			 
				System.out.println("Enter Fathers Height in ft and inches(6.1) is 6 ft 1 Inches: ");
				double dadFT = input.nextDouble();  //input 
				System.out.println("Enter Mothers Height in ft and inches: ");
				double momFT = input.nextDouble(); //input 
				
				double dadFT2I = dadFT ; // vars holding input values 
				double momFT2I = momFT ; //same as above 
				double maleFT =  ((momFT2I * 13/12) + dadFT2I)/2 ; //boy conversion 
				double femaleIn = ((dadFT2I * 12/13) + momFT2I) /2  ; //girl conversion 
				
				System.out.println("Your boy would be: " + df.format(maleFT) +" Feet" + "\n"
						+ "Your girl would be: " + df.format(femaleIn) + " Feet" + "\n" //output 
						);
				
				
				System.out.println("E to End");
				String end = input.nextLine(); //if they enter end, it shuts the whole program down
				if(end.equalsIgnoreCase("E")){ 
					System.exit(0);
				
					}
				}
		
		}

		
		
	
			
	
	
	public static void main(String[] args) {
		
		ch3Num3 class1 = new ch3Num3();
		class1.firstInput();
		class1.feetInches(); //called to the main for output
		
		
		
	
		

		}
		
	}


