//import java.math.*;;

public class Week1 {	
	//generate +0 from inf if no such semantics in your language
	//generate inf like max_value ^ 2 or 10 ^ 1000
	
	/*Function to test +0*/
	static boolean isPositiveZero(double x)
	{
		if (Math.abs(x-(+0)) < 0.000001)
		{
			return true;
		}
		else return false;
	}
	
	/*Function to test -0*/
	static boolean isNegativeZero(double x)
	{
		if (Math.abs(x-(-0)) < 0.000001)
		{
			return true;
		}
		else return false;
	}
	
	/*Function to test INF*/
	static boolean isPositiveInf(double x)
	{
		if (x > Double.MAX_VALUE)
		{
			return true;
		}
		else return false;
	}
	
	/*Function to test NINF*/
	static boolean isNegativeInf(double x)
	{
		if (x < Double.MIN_VALUE) //???
		{
			return true;
		}
		else return false;
	}
	
	/*Function to test NaN*/
	static boolean isNaN(double x)
	{
		if (Double.isNaN(x))
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] arg){
		/*Hacker Practice: Solve the quadratic equation*/
		double a = Math.pow(10, -20);
		double b = Math.pow(10, 3);
		double c = Math.pow(10, 3);		
		
		double x1 = (-b+Math.sqrt(b*b - 4*a*c)) / (2*a);
		double x2 = (-b-Math.sqrt(b*b - 4*a*c)) / (2*a);
		System.out.println(x1);
		System.out.println(x2);
		
		double x3 = (-2*c) / (b+Math.sqrt(b*b - 4*a*c));
		double x4 = (-2*c) /(b-Math.sqrt(b*b - 4*a*c)) ;
		System.out.println(x3);
		System.out.println(x4); 	
		//Potential problem: UNDERFLOW???
		
		/*Hacker Practice (1) */
		//Observe NaN and Inf handling in double
		double x = 0.0; 
		double y = 0.0;
		double in1 = 1/x;
		double in2 = y/x;
		System.out.println(in1);
		System.out.println(in2);
		
		//Observe NaN and Inf handling in integers
		long m = 0;
		long n = 0;
		int re1 = (int) (1/m);
		int re2 = (int) (m/n);
		System.out.println(re1);
		System.out.println(re2);
		
		/*Hacker Practice (2): Observe overflow handling in integers*/
		long i = 0; 
		int fac = 1;
		for (i = 2; i < 30; i++)
		{
			fac*=(int) i;
			System.out.println(i);
			System.out.println(fac);
		}
		
		for (i = 20; i > 1; i--)
		{
			fac /= i;
			System.out.println(fac);
		}			

		//generate infinity
//		float x = Double.POSITIVE_INFINITY;
//		System.out.println(1/(1/x));
//		float y = Double.NEGATIVE_INFINITY;
//		System.out.println(1/(1/y));		
		
		//generate NaN
		double NaN1 = Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY;
		double NaN2 = Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY;
		
//		System.out.println((NaN1-NaN2 == 0));
//		System.out.println((NaN1 == NaN2));
		
		/*Hacker Practice*/
		/*Test +0*/
//		System.out.println((+0 == -0));
		System.out.println(isPositiveZero(+1.0));
		System.out.println(isPositiveZero(-1.0));
		System.out.println(isPositiveZero(Double.MAX_VALUE));
		System.out.println(isPositiveZero(-1.0 * Double.MAX_VALUE));		
		System.out.println(isPositiveZero(+0));
		System.out.println(isPositiveZero(-0));
		System.out.println(isPositiveZero(+0.0));
		System.out.println(isPositiveZero(-0.0));
		System.out.println(isPositiveZero(Double.POSITIVE_INFINITY));
		System.out.println(isPositiveZero(Double.NEGATIVE_INFINITY));	
		System.out.println(isPositiveZero(NaN1));			

		/*Test -0*/
		System.out.println(isNegativeZero(+1.0));
		System.out.println(isNegativeZero(-1.0));
		System.out.println(isNegativeZero(Double.MAX_VALUE));
		System.out.println(isNegativeZero(-1.0 * Double.MAX_VALUE));		
		System.out.println(isNegativeZero(+0));
		System.out.println(isNegativeZero(-0));
		System.out.println(isNegativeZero(+0.0));
		System.out.println(isNegativeZero(-0.0));
		System.out.println(isNegativeZero(Double.POSITIVE_INFINITY));
		System.out.println(isNegativeZero(Double.NEGATIVE_INFINITY));
		System.out.println(isNegativeZero(NaN1));	
		
		/*Test INF*/		
		System.out.println(isPositiveInf(Double.MAX_VALUE));
		System.out.println(isPositiveInf(-1.0 * Double.MAX_VALUE));		
		System.out.println(isPositiveInf(+0.0));
		System.out.println(isPositiveInf(-0.0));
		System.out.println(isPositiveInf(Double.POSITIVE_INFINITY));
		System.out.println(isPositiveInf(Double.NEGATIVE_INFINITY));	
		System.out.println(isPositiveInf(NaN1));	
		
		/*Test NINF*/
		System.out.println(isNegativeInf(Double.MAX_VALUE));
		System.out.println(isNegativeInf(-1.0 * Double.MAX_VALUE));		
		System.out.println(isNegativeInf(+0.0));
		System.out.println(isNegativeInf(-0.0));
		System.out.println(isNegativeInf(Double.POSITIVE_INFINITY));
		System.out.println(isNegativeInf(Double.NEGATIVE_INFINITY));
		System.out.println(isPositiveInf(NaN1));	
		
		/*Test NaN*/
		System.out.println(isNaN(Double.MAX_VALUE));
		System.out.println(isNaN(-1.0 * Double.MAX_VALUE));		
		System.out.println(isNaN(+0.0));
		System.out.println(isNaN(-0.0));
		System.out.println(isNaN(Double.POSITIVE_INFINITY));
		System.out.println(isNaN(Double.NEGATIVE_INFINITY));
		System.out.println(isNaN(NaN1));		
		System.out.println(isNaN(NaN1 - NaN2));
		
		/*Hacker Practice: Observe the exception handling on your platform*/
		//make x with easily observable precision
		double z = 1.234567890123456;
		int k =1;
		//The normalized number is above 4.9406*10^(-324)
		z *= Math.pow(10, -307);		
		//Decrease the normalized number to the range of denormals	
		for ( k = 1; k <20 ; k++)
		{
			z /= 10.0;		
			System.out.println(z);
		}
		
	}

}
