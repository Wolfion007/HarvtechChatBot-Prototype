
import java.util.Scanner;
public class BotFunctions {
	
	static  String registerId;
	static String Name;
	static String aadharNumber;
	
	public static void main(String[] args) {
	
	Registration r= new Registration();
	r.registration();
	System.out.println("Enter Your Credentials again");
	Scanner sc= new Scanner(System.in);
	registerId=sc.next();
	Name=sc.next();
	aadharNumber=sc.next();
	String command;
	BisonProperties bp =new BisonProperties();
	BisonLocation bl=new BisonLocation();
	TrackBison tb= new TrackBison();
	ContactHarvtech th=new ContactHarvtech();
	
	if(aadharNumber.length()==10&&(Name!=null)&&Name.matches("^[a-zA-Z]*$")&&(!Name.equals(""))){
	System.out.println("Your Credentials are Valid");
	
//inputs from user//
	while(true) {
		
		command=sc.next();
		if(command.equals("Hello")) {
			System.out.println("Hello, It's Bison");
		}
	
		if(command.equals("Start the Bison")||command.equals("Switch On the Bison")) {
			System.out.println("Starting the Bison");
		}
		
		if(command.equals("About the Bison")||command.equals("Bison Properties")) {
			String s="";
			System.out.println(bp.modelProperties(s));
		}
		
		if(command.equals("Bison Location")||command.equals("Location of the Bison")) {
			String b="";
			System.out.println(bl.bisonLoc(b));
		}
		if(command.equals("Where is My Bison")||command.equals("Switch On the Bison")) {
			String b="";
			System.out.println("b1.bisonLoc(b)");
		}
		
	}
			
	}
else{
		
		System.out.println("Invalid Credentials register Again");
		
	}
	
	String commandIn=""; // change to button functionality
	if(commandIn.equals("Track Bison")||commandIn.equals("Track Bison")) {
		String b="";
		System.out.println("b1.trackBison(b)");
	}
	if(commandIn.equals("Contact Harvtech")||commandIn.equals("Contact the Manufacturer")) {
		String b="";
		System.out.println("b1.contactHarvtech(b)");
	}
	
	
	
	
	sc.close();	
	}

}
