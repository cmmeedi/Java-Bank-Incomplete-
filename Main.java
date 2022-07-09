import java.util.Scanner;

public class Main {

//	A Scanner utility to be able to create user inputs
	static Scanner sc = new Scanner(System.in);
//	Setting the Scanner to accept only numbers 
//	and assigning it to the variable
//	called "choice"
	int choice = sc.nextInt();
	//An object creation of the "TBank" Class
	static TBank tb = new TBank();

//	The Main.  Without this, everything in this program is for nothing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		This is a creation of the "Person" object
		Person p = new Person("Todd", "Broflowski", "1212 Indian Blvd", 
				97112, 234, 3920903);
		
//		This calls the "BGreeting Method along with 
//		the name of the Person Object
		BGreeting(p.getfName());

	}
	
//	This is the BGreeting method that displays some introduction text and
//	also calls the "BMenu" function from the "TBank" class
	static void BGreeting(String name) {
		System.out.println("Hello " + name);
		System.out.println("Thank you for choosing this bank out "
				+ "of all the banks in the world.  We appreciate you");
		System.out.println("Please choose one of the options below");
		tb.BMenu();
	}
	
	
	

	
	

	

}
