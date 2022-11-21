/**
 * 
 */

/**
 * @author APARNA
 *
 */import java.util.Scanner;
import java.util.Scanner;
 
public class totsal {

	

	/**
	 * @param args
	 * @param  
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter basic salary");
         float f1=s.nextFloat();
         System.out.println("enter hra");
         float f2=s.nextFloat();
         System.out.println("enter da");
         float f3=s.nextFloat();
         System.out.println("TOTAL SALARY IS"+f1+f2+f3);
	if(f1>=12000&&(f2>0&&f3>0))
	{
		System.out.println("Valid basic salary");
		System.out.println("valid hra and da");
	}	
		else
		{	
		
		System.out.println("invalid basic salary");
		
		System.out.println("Invalid hra and da");
		
			
	
	}
	}
}
