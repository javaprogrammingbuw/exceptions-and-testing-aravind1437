
public class ExceptionHandling {

	
	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		int a = 5;
		int b = 0;
		try {
		int div = a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.err.println("You should not divide a number by zero");
	    }
		
		try {
			int[] arr = new int[5];
			arr[5] = 7;
		}
		catch( ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println(" Check with the length of the array  ");
		}
		
		try {
			String one = "one";
			int i = Integer.parseInt(one);
		}
		catch(java.lang.NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Invalid Format");
		}
		
		double c = -7.0;
		try {
			 NegativeInteger(c);
		} catch(NegativeIntegerException e) {
			e.printStackTrace();
		}
	
	}
	public static double NegativeInteger(double c) throws NegativeIntegerException{
		if(c<0){
		     throw new NegativeIntegerException("The given valve is a Negative Integer");
        }else {
        	double d = Math.sqrt(c);
        	return d;
        }
	}
	
}
