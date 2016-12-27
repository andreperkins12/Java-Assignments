//input of grades, scores etc. 3 quizes out of 10, midterm out of 100, final of 230
//midterm accounts for 35%, final is 40%, 3 quizes together are 25%
import java.util.Scanner;
import java.text.DecimalFormat;

public class ch4pb6 { //public class
private double quizscore; //set var
private double midtermscore;
private double finalscore;
double overallScore; //same as avobe 
Scanner input = new Scanner(System.in); //scanner 
DecimalFormat df = new DecimalFormat("0.00"); //decimal format 

public void quiz (){ //quiz output and calc
	System.out.println("Enter Overall Quiz Score(N/30): ");
	quizscore = input.nextDouble();
	quizscore = quizscore/30;
}

public void midterm(){ //midterm input and calcualtion
	System.out.println("Enter Your Midterm Score(N/100): ");
	midtermscore = input.nextDouble();
	midtermscore = midtermscore/100;	
}

public void finalscore(){ //finalscore input and calc 
	System.out.println("Enter Final Score(N/100): ");
	finalscore = input.nextDouble();
	finalscore = finalscore/100;
}

public void output(){
	//overall score calcualtion of weighted grdes
	overallScore = (quizscore * .25) + (midtermscore * .35) + (finalscore * .4);
	System.out.print("Your Weighted Grade is: " + " \n" + df.format(overallScore * 100));	
	//output in System.out 
}

	public static void main (String[]args){
		ch4pb6 pract = new ch4pb6();
		pract.quiz();
		pract.midterm();
		pract.finalscore(); //called methods to main class 
		pract.output();
	
	}
}
