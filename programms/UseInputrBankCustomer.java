/**
 * 
 */
/**
 * @author APARNA
 *
 */import java.util.Scanner;
public class UseInputrBankCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   System.out.println("BANK CUSTMOER DETAILS are");
   Scanner s =new Scanner(System.in);
   System.out.println("enter account number");
   long  l= Long.parseLong(s.nextLine());
   System.out.println("enter account holder name");
   String ss= s.nextLine();
   System.out.println("balance amount is");
   float d= Float.parseFloat(s.nextLine());
   System.out.println("account type is");
   String s2=s.nextLine();
   System.out.println("====customer details===");
   System.out.println("acc number:"+l);
   System.out.println("holder name"+ss);
   System.out.println("balance amt"+d);
   System.out.println("acnt type"+s2);
   
   
	}

	}

