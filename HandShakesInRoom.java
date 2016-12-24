import java.util.Scanner;
//Complete
public class HandShakesInRoom {
	static int people; //number of people in the room
	static Scanner input = new Scanner(System.in); //input
public static int handShakes(int people, int count){ //handshake recursive method
	count = 0; //counter
	if( count == people){
		return 0; //program ends
	}
	if(people < 1){ //0 handshakes
		return 0;
	}if(people == 2){ //only one handshake
		return 1;
	}else{
		return (people - 1) + handShakes(people - 1, count ++); //recursive method
	}
}


	public static void main(String[] args) { //called to main
		int count = 0;
		System.out.println("Enter People in Room: "); //input
		people = input.nextInt();
		System.out.println(handShakes(people, count)); //output

	}

}
