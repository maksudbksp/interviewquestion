package Pak2;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println("Result is : "+c);
		
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
			
		}
	}

}
