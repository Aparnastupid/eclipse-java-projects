/**
 * 
 */

/**
 * @author APARNA

 *
 */import java.math.BigDecimal;
public class Datatypes1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int a=10,b=20,c=a+b;
	     String String = "APPU";
		boolean bool= true;
		float  f1= 10.5f,f2=10.5f,f3=f1+f2;
		
		char ch = 'c';
		byte b1 = 2;
		double d1=10.5,d2=10.5,d3=d1+d2;
		BigDecimal d= new BigDecimal("10.5");
		BigDecimal dd= new BigDecimal("10.5");
		
		System.out.println("result of a+b is"+c);
		System.out.println("bool value is"+bool);
		System.out.println("floating value is"+f3);
		System.out.println("character value is"+ch);
		System.out.println("byte value is"+b1);
		System.out.println("bigdecimal"+d.add(dd));
		
		

		
		
		
		
		
	

	}

}
