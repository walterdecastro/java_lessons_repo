package errors_lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideByZero {

	public static void main(String[] args) {
		
		try {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Number: ");
			int a = s.nextInt();
			System.out.println("Divider: ");
			int b = s.nextInt();
			
			System.out.println(a / b);
			
		} 
		catch(InputMismatchException e1) {
			System.out.println("Erro of InputMismatchException catch!");
		}
		catch(Throwable e2) {
			System.out.println("Erro of ArithmeticException catch!");
		}
		
		
		/* int x = 1/0;
		 * in this exception we have the following message in the console:
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at errors_lessons.divideByZero.main(divideByZero.java:7)
		 * */

	}

}
