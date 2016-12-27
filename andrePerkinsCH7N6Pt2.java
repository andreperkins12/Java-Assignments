
public class andrePerkinsCH7N6Pt2 extends andrePerkinsCH7N6 {

	
	public void getTruck(){ //get all the truck info
		andrePerkinsCH7N6 getInfo = new andrePerkinsCH7N6();
		getInfo.input();
		
		getInfo.vehicle(name, engine, price, load, loadLBS);
		getInfo.seTOwner();
	}
	public static void main(String[] args) {
		andrePerkinsCH7N6Pt2 callToMain = new andrePerkinsCH7N6Pt2();
		callToMain.getTruck(); //all variables called to main

	}

}
