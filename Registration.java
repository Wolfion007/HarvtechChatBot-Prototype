import java.util.*;
public class Registration extends BotFunctions {
	
	protected static String registerId;
	protected static String Name;
	protected static String aadharNumber;
	

	public static void registration() {
		Scanner sc= new Scanner(System.in);
	    registerId=sc.next();
		Name=sc.next();
		aadharNumber=sc.next();
		boolean b= false;
		
		if(aadharNumber.length()==10&&(Name!=null)&&Name.matches("^[a-zA-Z]*$")&&(!Name.equals(""))) {
		      b =true;
		      System.out.printf("%s,%s,%s",registerId,Name,aadharNumber);
		      
		}
	}

}
