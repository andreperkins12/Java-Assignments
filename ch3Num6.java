import java.util.Scanner;
//population size is the same for 4 days then increases on the 5th day
public class ch3Num6 {
	Scanner input = new Scanner(System.in);
	private int greenCrud = 20;
	private int prev = 0;
	private int last;  //set private variables
	private int days;
	
	
	public void input (){
		System.out.println("Enter Amount of Days for Green Crud Population:");
		days = input.nextInt();
		input.close();
	}
	
	
	public void equation(){
		//if days is divisible by 4, green crud stays same, else added
		for(int i = 0; i < days; i +=4){ //for every forth day
			last = prev;
			prev = greenCrud;
			greenCrud = last + prev; //loop
		}
	
	}
	public void output(){ //output of equation above
		System.out.println("The Previous was: " + prev);
		System.out.println("The Current is: " + greenCrud);
	}
	


	public static void main(String[] args) {
		ch3Num6 cls = new ch3Num6();
		cls.input(); //print out from class
		cls.equation();
		cls.output();

	}

}
