//Complete
import java.util.Scanner;

public class NonnegativeInput extends Exception {
	Scanner input = new Scanner(System.in); //scanner
	int N; //Numbers to enter
	int n; //numbers
	int count= 0; //count var
	public void getInput(){ 
		//get input for amount of numbers ot input
		try{
		System.out.println("Enter N: "); //enter N
		N = input.nextInt();
		if(N < 1){ //if N is below 1 throw exception
			throw new Exception();
		}
		}catch(Exception e){
			System.out.println("Invalid N, try Again");
			getInput(); //retry to input N
		}
	}
	public void numbers(){ //method for input of numbers
		try{
			while(count < N){ //count increments 
				System.out.println("Enter Numbers: "); //numbers input
				n = input.nextInt();
				count++;
				if(n < 0){
					throw new Exception();
				}
				if(count == N){ //when while loop is over the Program is complete
					
					System.out.println("Program Complete!");
				}
			}
		}catch(Exception e){ //exception
			System.out.println("Invalid input, No Negative Numbers. Try Again");
			count--;
			this.count = count; //if negative number the count decreases by 1, and this count is the actual count number
			numbers();
		}
	}
	public void output(){
		int count = 0;
		getInput();
		numbers(); //output of methods
	}
	public static void main(String[] args) throws Exception {
		NonnegativeInput method = new NonnegativeInput();
		method.output();
	}
}
