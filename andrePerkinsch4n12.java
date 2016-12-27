import java.util.Scanner;
public class andrePerkinsch4n12{
	static Scanner input = new Scanner(System.in); //scanner
	static private int numEntries;
	private int size; //size of pizz
	private int cheese;
	private int ham;
	private int pep;
	static int overallPrice; 
	//all above are my variables for the entire class
	//static variables appear in the main method
	
	
public void pizza1(int toppings, int price,int psize){ //setPizza 1 that is called from order1
	numEntries --;
	System.out.println("Enter Size of Pizza (1,2,3)\nFollowed by Quanitity of Cheese, Ham , Pepperonni Toppings:");
	psize = input.nextInt();
	cheese = input.nextInt();
	ham = input.nextInt();  //all variables for input of their size of pizza and amount of toppings they want
	pep = input.nextInt(); 
	
	if(psize == 1){
		size = 10;  //psize represents the size of pizza, size variable represents the price of the variable
	}else if (psize == 2){
	size = 12;
	}else if( psize ==3){  //same varibales are used Below in the other pizza orders
		size = 15;
	}
	
	toppings = (cheese + ham + pep) * 2;  //toppings are all 2 dollars each, to get total costs multiply quantity times price
	price = size + toppings;
	overallPrice += price;  //overprice of the whole order
	
	System.out.println("Price of Pizza 1: " + price);
	System.out.println("Your Overall Price for your Pizzas is: " + overallPrice);
	
}


public void pizza2(int toppings, int price, int psize){ //set pizza 2, same as set one if they want a second pizza
	numEntries --;
	System.out.println("Enter Size of Pizza (1) Small, 2) Medium ,3) Large )\nFollowed by Quanitity of Cheese, Ham , Pepperonni Toppings:");
	psize = input.nextInt();
	cheese = input.nextInt();
	ham = input.nextInt();
	pep = input.nextInt(); 
	if(psize == 1){
		size = 10;
	}else if (psize == 2){
	size = 12;
	}else if( psize ==3){
		size = 15;
	}
	
	toppings = (cheese + ham + pep) * 2;
	price = size + toppings;
	overallPrice += price;
	
	System.out.println("Price of Pizza 2: " + price);
	System.out.println("Your Overall Price for your Pizzas is: " + overallPrice);
	
}


public void pizza3(int toppings, int price,int psize){ //if they want a third pizza, this same method is called
	numEntries --;
	System.out.println("Enter Size of Pizza (1,2,3)\nFollowed by Quanitity of Cheese, Ham , Pepperonni Toppings:");
	psize = input.nextInt();
	cheese = input.nextInt();
	ham = input.nextInt();
	pep = input.nextInt(); 
	if(psize == 1){
		size = 10;
	}else if (psize == 2){
	size = 12;
	}else if( psize ==3){
		size = 15;
	}
	toppings = (cheese + ham + pep) * 2;
	price = size + toppings;
	overallPrice += price;
	System.out.println("Price of Pizza 3: " + price);
	System.out.println("Your Overall Price for your Pizzas is: " + overallPrice);
}

	public static void main(String []args){
		andrePerkinsch4n12 order = new andrePerkinsch4n12(); //object to call to my andrePerkins class
		andrePerkinsch4n12 order2 = new andrePerkinsch4n12();
		andrePerkinsch4n12 order3 = new andrePerkinsch4n12();
		System.out.println("How Many Pizzas Would You Like to Order (Max 3):"); //output to user to enter number of entris
		numEntries = input.nextInt();
		int toppings = 0;
		int price = 0;  //set to 0, since called to main
		int psize = 0;
		do{
			if(numEntries == 1){ //if they only want one pizza call this method
				numEntries--;
				order.pizza1(toppings, price, psize);
			}
			if(numEntries == 2){ //if the user wants 2 orders call this method
				numEntries--;
				order.pizza1(toppings, price, psize);
				order2.pizza2(toppings, price, psize);
			}
			if(numEntries == 3){ //if they want three same as above
				numEntries--;
				order.pizza1(toppings, price, psize);
				order2.pizza2(toppings, price, psize);
				order3.pizza3(toppings, price, psize);
			}
			if(numEntries == 0){
				break;  //if the nunmber of entries equals 0, the order is comeplte
			}
		}while(numEntries != 0);  //do, while looop that will continue unil order is compelte
		
	}
}