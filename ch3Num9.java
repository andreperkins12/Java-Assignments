import java.util.Scanner; //Scanner for input 

public class ch3Num9 {
//COMPLETE
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner
		int counter =0; //counter
		int points = 0; //points 
		int overall = 0; //overall
		System.out.println("Enter amount of Assignments: "); //print statements 
		int assignments = input.nextInt(); //user inputs amount of assignments 
		
		for(int i =0; i < assignments; ++i){ //iterates through for the amount of assignments 
			counter++; //counter increases as assignments do
			System.out.println("Enter Points on Assignemnt " + counter +":");
			points = input.nextInt(); //points are inputted
			overall += points; //points add together to get overall score

		}
		
			
		
		System.out.println("Your Overall Score is : " + overall); //print statement

	}

}