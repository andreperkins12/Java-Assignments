public class ch3Num5 {
	//Complete
final int monthP = 50; //final monthly payments
final double monthIntR = .015; //interest rater per month
int months = 0; //month counter 
double debtPN = (1000 * monthIntR);
double debtP = monthP -debtPN;
double payment = 1_000 - debtP; //965 //calculate our first month payment
	
public void add(){
	while(payment < 1000 && payment >= 0){ //the payment is less than 1000 and greater or equal to 0, do this
		double debt = payment * monthIntR; //debt is our new payment value * the interest rate
		double debtp = 50 - debt; // our new debt paid is 50 - our new debt value 
		payment = payment - debtp; // our new payment is our new payment value - our new debt paid value 
		months++; //month increments 
	}
	
	if ( payment <= 0){
		System.out.println("It will take approximately " + months + " months to pay"); //once reached 0 or equivalent print out motnhs 
	}
}
	
	public static void main(String[] args) {
	
	ch3Num5 pay = new ch3Num5();
	pay.add(); //called in main 
	
	}

}
