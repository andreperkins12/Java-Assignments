
public class andrePerkinsCh7N4Pt2 extends andrePerkinsCh7N4 { //extended class
	
		int salary;  //new salary variables
		public void salary(){
			if(title.equalsIgnoreCase("Director")){
				salary = 50000;
			}else if(title.equalsIgnoreCase("Vice President")){
				salary = 75_000; //if one is selected salary is dependant of the job position
			}
			switch (position){
			case 1 : 
				job = "Production";
				salary += 2_000;
				break;
			case 2 : 
				job = "Accounting";
				salary += 3_000;
				break;
			case 3: 
				job = "Personnel";
				salary += 4_000;
				break;
				
			}
			
			System.out.printf("Job Title: %-20s\nJob Department: %-20s\nJob Salary: %-30d", title, job, salary); //print out all info
		}
	

	
	public static void main(String[] args) {
		andrePerkinsCh7N4Pt2 info = new andrePerkinsCh7N4Pt2 ();
		info.getTitle();
		info.salary(); //get methods in different classes to get all info

	}

}
