import java.util.Scanner;

public class andrePerkinsCh7N4  {
	String title;
	int position;
	String job; //variables, title positions and job
	
		Scanner input = new Scanner(System.in); //input
		
		public void getTitle(){ //get all information
			
			System.out.println("Director or Vice President: " );
			title = input.nextLine();
			System.out.println("Department Enter Number : 1) Production, 2) Accounting, 3) Personnel");
			position = input.nextInt();
			
		}
			
	public static void main(String []args){ //called in extended class

	}


}
