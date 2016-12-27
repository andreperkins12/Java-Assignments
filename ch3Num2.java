import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
//COMPLETE
public class ch3Num2 {
	DecimalFormat df = new DecimalFormat("0.00"); //decimal format
	Scanner input = new Scanner(System.in); //user input 
	Random ran = new Random(); //random num generator 
	int counter = 0; //amount of wins
	//games counter 
	
	int loss = 0; //amounts of loses
	
	public void game(){
		
		
		for(int games = 0; games < 10_000; ++games){ //for loop that plays 10 k games 
			int dice = ran.nextInt((6 -1)  + 1) + 1; //takes a min of 1 instead of 0 and max of 6
			int dice2 = ran.nextInt((6 -1)  + 1) + 1; //^^ same as above
			int score = dice + dice2; //score of new roll
			
			
			if(score ==7 || score == 11){ //auto win
				counter++; 
				//come out roll  auto win
			
			}if( score == 2 || score == 3 || score ==12){ //auto loss 
				loss++; //come out automatic loss
			} else if(score != 7 || score != 11 || score != 4 || score != 5 || score != 6 || score !=8 || score != 9 || score != 11 ) {
				loss++; //if come out roll does not equal anything
			}else if(score == 4 || score == 5 || score == 6 || score ==8 || score == 9 || score == 11 ){
				int rolla = ran.nextInt(6); //new roll of dice
				int rolla2 = ran.nextInt(6); //new roll of second cie
				int rollaO = rolla + rolla2 + score; //new dice number added to the orignial score of th designated values above
				System.out.println("this is : " + rollaO);
				
				if(rollaO == 7 || rollaO ==11){ // if new value is 7 or 11 they win
					counter++;
				}if(rollaO != 7 || rollaO != 11){ //if not it is a loss
					loss++;
				}
				
				
			}
		}
		int loses = 10_000 - counter; //counter is the amount of wins and it is out of 10k games 
		System.out.println("You have one "  + counter + " Times " + "and the computer has won "  + loses + " times" +
				"\n" + df.format((loses/ counter)) + " percent is the percentage of wins"
				);
		
	}

	public static void main(String[] args) {
		
		ch3Num2 g = new ch3Num2();
		g.game();
		
		
		
		
		

	}

}
