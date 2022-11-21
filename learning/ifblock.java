/**
 * 
 */
package learning;

import java.util.Scanner;

/**
 * @author APARNA
 *
 */
public class ifblock {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a;
		{
			System.out.println("enter any number");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();	
		}
		if(a%2==0)
			
		{
			System.out.println("we are inside the true block");
			System.out.println("given number is even number");
		}
	
	 else 
		{
			System.out.println("we are outside the true block");
			System.out.println("given no is even no");
			System.out.println("we are out of the block");
		}
		
			
	}

}
