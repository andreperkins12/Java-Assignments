import java.util.Scanner;
import java.util.Random;


public class ch3Num10 { //called all variables to static to be recognized in main static method
static Scanner input = new Scanner(System.in); //scanner input 
static Random random = new Random(); //random number generator
boolean gameOver;
static int score;
static int scoreC;
static int dice;
static int dice2;
static int compDice;
static int compDice2;
static int nopoints;
static String firstUR;
static String rOrh;
static int round;

	
public static void main (String[]args){ //main method 
		
while(score <= 100 && scoreC <= 100){ //run through code as long as scores are not 100
		round++;   //round increments 
		System.out.println("It is Round " + round); //shows what round it is 
		System.out.println("(r)oll:"); //roll to roll for user
		firstUR = input.nextLine(); //taken string as input 
		
		
		do {  //do while loops 
			if(firstUR.equalsIgnoreCase("R")){
				dice = random.nextInt((6)+1);  //if they want to roll have the dice equal a random number 
			}
				if(dice == 1){
					 //i the dice is one they get no points and the score is 
					nopoints++;
					System.out.println("Your Rolled a 1, End Turn. Your Score is: "+ (score));
					break; //ends turn 
					
					
				} else if( dice == 2 || dice ==6){
					System.out.println("Your Rolled a 2 or 6");
					System.out.println("(r)oll or (h)old: ");
					rOrh = input.nextLine(); //hold or roll again option if they roll a a 2 or 6 
					
					if (rOrh.equalsIgnoreCase("R")){   //if they select roll again have anopther roll equal a diff number 
						dice2 = random.nextInt((6)+1);
						score = score + dice + dice2;
						System.out.println("You Rolled Again, Your Score is now: " + score); //output score 
						break; //end turn 
					} else if(rOrh.equalsIgnoreCase("H")){ //if they hold, the score is at a holding position 
						score = score + dice ;
						System.out.println("You held, End Turn. Your Score is: " + score);
						break; //end turn 
					}else if(dice == 3 || dice == 4 || dice == 5){ //if they rolled a different number then it is added to the score 
						score = score + dice;
						System.out.println("You Score is now: " + score);
						break; //ends  turn 
					
					}
				}
					 
				
			}while (score <= 100 && scoreC <= 100); //loops through if there still is now winner yet 
				if(score >= 100 && score > scoreC ){ //if the user wins print out and end
					System.out.println("You Won -> " + score + " <- Computer Score was: " + scoreC );
					break;
				}
		
			
				
				
				
			//Computer Side of Game, has the same loops as before, just no user input and I made it so that if 
				//it rolls a 2 or 6, it automatically rolls again, only difference between the user and the computer 
			do {
				compDice = random.nextInt((6)+1);
				
				if(compDice == 1){
					scoreC = scoreC + compDice;
					nopoints++;
					System.out.println("Computer has Rolled a 1. Computer Score is " + scoreC + " It is your Turn.");
					break; //ends turn 
				
				} 
				
				if(compDice == 2 || compDice == 6){
					compDice2 = random.nextInt((6)+1);
					scoreC = scoreC + compDice + compDice2;
					System.out.print("The Computer has Rolled a 2 or 6, C score is now : " + scoreC + "\n");
					break; //ends turn 
					
				} 
				
				if ( compDice == 3 || compDice == 4 || compDice == 5){
					scoreC = scoreC + compDice;
					break; //ends turn 
				}
			
			}while(score <= 100 && scoreC <= 20 && scoreC <= 100);
			
			if(scoreC >=100  && scoreC > score){
				System.out.println("The Computer Has Won -> " + scoreC + " <- Your Score was: " + score);
				break; //ends program
				
			}
			
		} 
		
	}
	
}
