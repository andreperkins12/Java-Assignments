//Complete
import java.util.Scanner;

public class InputMonths { //class
Scanner input = new Scanner(System.in);
int month;
int day;
int year; //all above variables month,day year
boolean leapYear; //if it is a leapyear or not
String theMonth; //String var for month

public class MonthException extends Exception{
	MonthException(String message){
		super(message);  //monthException to call
	}
	
}
public class DayException extends Exception{
	DayException(String message){
		super(message); //DayException to call
	}
}
public class YearException extends Exception{
	YearException(String message){
		super(message); //Year Exception to call
	}
}
	public void inputMonth(){ //get Month input from user
		try{
		System.out.println("Enter Month (int) : ");
		month = input.nextInt();
		if(month > 12 || month < 1){ //contraints on the month input
			throw new MonthException(theMonth); //throw exception
		}
		}catch(MonthException month){
			System.out.println("Invalid Month Input, redo");
			inputMonth(); //rollback for input
		}
	}
	public void inputDay(){ //input of day
		try{
			
		System.out.println("Enter Day ");
		this.day = input.nextInt();
		
		if(month == 2 && day > 29){ //contraints on february
			throw new DayException(" ");
		}if(day == 0 || day > 31){ //contraints on all months
			throw new DayException(" ");
		}if(day > 30 && month == 4 || month == 6 && day > 30 || month == 9 && day > 30  || month == 11 && day > 30 ){
			throw new DayException(" "); //months wiht 30 days, the rest are 31
		}
			
			
		}catch(DayException dayE){
			System.out.println("Invalid Day Input!");
			inputDay(); //catch exception
		}
	}
	public void inputY(){ //year input
		try{
		System.out.println("Enter year: ");
		year = input.nextInt();
		if(year %4 != 0){ //year is not leap year if meets condition
			leapYear = false;
			if(leapYear == false && month == 2){ //february is the only day that changes when there is a leap year
				throw new DayException(" ");
			}
		}
		if(year < 1000 || year > 3000){ //year contraints
			throw new YearException(" Invalid");
		}
		}catch(YearException ye){
			System.out.println("Invalid Year Input, redo");
			inputY();
		}catch(DayException De){
			System.out.println("It is not a leap year, February has 28 days");
			inputDay();
		}
	}
		public String getMonths(){ //integer to String Month
			switch(month){
			case 1:
				if(month == 1){
					this.theMonth = "January";
				}
			case 2:
				if(month == 2){
					this.theMonth = "February";
				}
			case 3:
				if(month == 3){
					this.theMonth= "March";
				}
			case 4:
				if(month == 4){
					this.theMonth = "April";
				}
			case 5 :
				if(month == 5){
					this.theMonth = "May";
				}
			case 6:
				if(month == 6){
					this.theMonth = "June";
				}
			case 7:
				if(month == 7){
					this.theMonth = "July";
				}
			case 8:
				if(month == 8){
					this.theMonth = "August";
				}
			case 9:
				if(month == 9){
					this.theMonth = "September";
				}
			case 10:
				if(month == 10){
					this.theMonth = "October";
				}
			case 11 :
				if(month == 11){
					this.theMonth = "November";
				}
			case 12:
				if(month == 12){
					this.theMonth = "December";
				}
				
		}
			return theMonth;	
		}
	
		
		public void getDate(){
				System.out.println(theMonth + " " + day + " " + year);
		} //get Date
		
		public void output(){ //call objects for output
			InputMonths  ch = new  InputMonths();
			 ch.inputMonth();
			 ch.getMonths();
			 ch.inputDay();
			 ch.inputY();
			 ch.getDate();
			 
		}
	
	public static void main(String[] args) {
		InputMonths  ch = new  InputMonths();
		ch.output(); //output
	}

}
		
