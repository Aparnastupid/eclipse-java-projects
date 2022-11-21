/**
 * 
 */
package learning;

import java.util.Scanner;

/**
 * @author APARNA
 *
 */
public class ifelseloop {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("enter a value");
        System.out.println("enter b value");
        Scanner s= new Scanner(System.in);
        a= s.nextInt();
        b=s.nextInt();
        if(a>b)
        {
        	System.out.println("print a is bigger than b");
        }
        else
        {
        	System.out.println("b is bigger than a");
        }
	}

}
