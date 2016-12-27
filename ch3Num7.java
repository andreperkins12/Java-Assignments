import java.util.Scanner;
import java.text.DecimalFormat;

public class ch3Num7 { //public class 
static Scanner input = new Scanner(System.in); //scanner input for user 
static DecimalFormat df = new DecimalFormat("0.00"); //decimal format for large numbers 
static double x;
static int sum;
static int answer;  //static ints to be used int mains 
static int num; 

	public static void main(String[] args) {	 //main 	
		System.out.println("Would you like to calculate a factorial (Y/N):");
		String yesN = input.nextLine(); //asks if the want to calculate 
		 
		 do { //d while loop
			 
			System.out.println("Enter a value for x (1-10, 50, 100) or hit 0 to Exit:");		
				x = input.nextDouble(); //enter values, x stores input 
				
				if(x == 0){
					System.out.println("Program Ended");  //end program loop 
					break; //ends program 
				}
				
				
				if(x == 50){  //if x = 50 the have it factorial 
					for(int fact = 1 ; fact <= x; fact++){
						x *= fact; //x = x * fact ,
						
						if(fact == 50){
							break; // once it reaches 50 end 
						}
						System.out.println(df.format(x));
						//print out 
					}
					
				}
				
				
				if( x == 100){
					for( int fact = 1; fact <= x; fact++){
						x *= fact;
						
						if(fact == 100){
							break;
						}
						System.out.println(df.format(x)); //same loops as above for 100 
					}
				}
				
				
				
				if( x >= 1 && x <= 10){  //for numbers 1 - 10
					num = (int) x; // have the number set to what x is 
					
					for( int fact = 1; fact <= x; fact++){
						
						x *= fact;
						
						if(fact == num ){ //end the program when fact equals the number so it does not exceed its factorial 
							break;
						}
						System.out.println( df.format(x));
					}
					
				}
				
				
	
				 
			
		 }while (yesN.equalsIgnoreCase("Y"));
		 
		 if(yesN.equalsIgnoreCase("N")){  //end  of do while loop
			 System.out.println("Opps, Ended");
		 }
		 
		 

		 
		
		 
		 
		
		
	}
	//end of main method
	
	
	} //end of public class


