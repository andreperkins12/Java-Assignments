import java.util.*;
public class andrePerkinsCH7N6 {
Scanner input = new Scanner(System.in);
static Stack<String> pastOwners = new Stack<String>();
String manufacturer = "BMW";
	String name;
	String engine; 
	int price;
	double load;
	double loadLBS;
	//all variables are set
	public void input(){ //input of all the owners that had the vehicle
		while(name != "e"){
		System.out.print("Enter Name of Owners or (e)xit: ");
		name = input.nextLine();
		pastOwners.push(name);
		if(name.equalsIgnoreCase("E")){ //break once exit is entered
			pastOwners.pop();
			break;
		}
		}
	}
	public String seTOwner(){  //set our owners in order of stack, shows the most recent owner
	this.name = pastOwners.pop();
	System.out.println("Current Owner: " + name);
	return name;
	}
	
	public void vehicle(String name, String engine, int price, double load, double pounds){ //set all variables to user input except manufacturer which is BMW 
		//tons to pounds calculation
		
		System.out.println("What type of vehicle do you own:");
		name = input.nextLine();
		System.out.println("What type of engine do you have(V6 or V8): ");
		engine = input.nextLine();
		System.out.print("Load Capacity in Tons: ");
		load = input.nextDouble();
		
		pounds = load * 2_000; //tons to pounds calculation
		System.out.print("Price of vehicle:");
		price = input.nextInt();
		
		this.name = name;
		this.engine = engine;
		this.load = load;
		this.loadLBS = pounds;
		this.price = price; //set variables to this variable to set as most recent
		for(String x : pastOwners){
		System.out.println("Past Owners: " + x);
		}
	System.out.println("Vehicle Details: " + "\nManufacturer: " + manufacturer +  "\nType: " + name + "\nEngine: " + engine + " \nPrice: " + price + 
			"\nCapacity in tons: "+ load + "\nCapacity in pounds: " + loadLBS); //print out all information
	
		
	}

	public static void main(String[] args) {
		
	}

}