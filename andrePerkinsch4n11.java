import java.util.Scanner;
import java.text.DecimalFormat;

public class andrePerkinsch4n11 {
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("$ 0.00"); //decimal format
	private int pizzaSize; int chC;
	private int pizzaCost; int hamC;
	String pizzaType;  int pC;     //all private varibales for my andre Perkins class to be used
	private int toppingOrder;
	boolean complete;
	int toppingCost;
	int price;  
	public andrePerkinsch4n11(int cheese, int ham, int pep){
		System.out.println("Size of Pizza's:\n1) Small 2) Medium 3) Large"); //asks for size of pizza
		pizzaSize = input.nextInt();
		if(pizzaSize == 1){
			pizzaType = "Small";  //depending on their input, the size is determiend as wll as the price of the pizza
			pizzaCost = 10;
		} else if ( pizzaSize == 2){
			pizzaType = "Medium";
			pizzaCost = 12;     //same as above
		} else if (pizzaSize == 3){
			pizzaType = "Large";
			pizzaCost = 15;
		} if(pizzaSize > 3){
			System.out.println("Error out of Bounds, No Pizza For you!");
			System.exit(0);
		}
		do{
		System.out.println("Toppings: $2 Each \nChoose Toppings or 0 to end Order: 1) Cheese 2) Ham 3) Pepperonni");
		toppingOrder = input.nextInt();     //asks for the amount go topppigns that they want 
		int fixedT = 2;
			if(toppingOrder == 1){
				cheese++;                 // they want cheese, cheese Quanitiy goes up
				chC =  fixedT * cheese;     //price of the cheese topping which is a fixed rate
				System.out.println(chC);   
				System.out.println("Cheese Topping: " + cheese);
			}else if ( toppingOrder == 2){    //same as above with ham topping 
				ham++;
				hamC = 2 * ham;
				System.out.println("Ham Topping: " + ham);
			}else if (toppingOrder == 3){
				pep++;                //same as above
				pC = 2 * pep;	
				System.out.println("Peporonni Topping: " + pep);
			} if(toppingOrder > 3){
				System.out.print("Error no Topping\n");
			}
			if(toppingOrder == 0){
				complete = true;
				break;
			}
			toppingCost = chC + hamC + pC;
		}while(complete == false);
		System.out.printf("%-10s %-10s \n", "Pizza Type: ", pizzaType);    //prints out the pizza type and the amount 
		System.out.printf("%-10s \n%-10s %-10d %-10s %-10d %-10s %-10d\n", 
				"Toppings: ", "Cheese" , cheese, "Ham ", ham , "Peperonni", pep);
	}
	public void costCalc( ){	
		price = pizzaCost + (toppingCost);
		System.out.println("Price of Pizza: "+ df.format(price) );  //calculates the totla cost
	}

public static void main(String []args){
	int cheese = 0; int ham = 0; int pep = 0;  
	andrePerkinsch4n11 re = new andrePerkinsch4n11(cheese, ham, pep); //object to call to class method
	re.costCalc();    //call to caluclate costs
	}
}
		
		

	



