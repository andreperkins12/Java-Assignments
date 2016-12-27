import java.util.Scanner;
//COMPLETE 
public class ch3Num1 { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner var 
		System.out.println("Enter First Guess(0-15): "); //out for input 
		int guess = input.nextInt(); //guess represnted by var 
		int n = guess/2; //calc 
		int r = n/guess; //cacl
		int guessSet = (guess + r)/2; //calc 
		
		while(guess != guessSet){ //loop when it is not equla 
			System.out.println("Enter Another Guess That is Closer: ");
			int n2 = guess/2;
			int guess2 = input.nextInt(); //new guess and input 
			
			
			
			
			if( guess2 == guessSet -1 || guess2 == guessSet +1 ){
				System.out.println("You were close"); //if guess is close loop
			}else if ( guess2 == guessSet){
				System.out.println("You Are Correct"); //correct  loop 
				break;
			}
		
	
		}
	
			
		}

	}

