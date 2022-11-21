/**
 * 
 */

/**
 * @author APARNA
 *
 */
import java.util.Scanner;


public class percentage {

	private static int f;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER TELUGU MARKS");
	int tel= s.nextInt();
	System.out.println("ENTER ENGLISH MARKS");
	int eng= s.nextInt();
	System.out.println("ENTER HINDI MARKS");
	int hin= s.nextInt();
	System.out.println("ENTER MATHS MARKS");
	int mat= s.nextInt();
	System.out.println("ENTER SCIENCE MARKS");
	int sci= s.nextInt();
	System.out.println("ENTER SOCIAL MARKS");
	int soc= s.nextInt();
	int telugu =tel;
	int english=eng;
	int hindi=hin;
	int maths=mat;
	int science=sci; 
	int social=soc;	
	

int totalmarks = tel+hin+eng+mat+sci+soc;
float f =600f;


System.out.println("percentage is"+f%totalmarks);
if(totalmarks==0||totalmarks>=0&& totalmarks<=100)
		{
	System.out.println(" TOTAL MARKS"+totalmarks);
}

else {
     System.out.println("invalid marks");

}	
	
	}}
