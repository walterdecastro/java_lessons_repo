package errors_lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideByZero {

	public static void main(String[] args) {
		
		
			Scanner s = new Scanner(System.in);
			boolean continuar = true;
		
		do {
			
			try {
				
				System.out.println("Number: ");
				int a = s.nextInt();
				System.out.println("Divider: ");
				int b = s.nextInt();
				
				System.out.println(a / b);
				continuar = false;
				
			} 
			catch(InputMismatchException e1) {
				System.out.println("Favor inserir numeros inteiros");
				s.nextLine(); //descarta entrada inválida
			}
			catch(Throwable e2) {
				System.out.println("O divisor deve ser diferente de zero");
			}
			finally {
				System.out.println("Finally executado...");
			}
			
		} while(continuar);
		
		/* int x = 1/0;
		 * in this exception we have the following message in the console:
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at errors_lessons.divideByZero.main(divideByZero.java:7)
		 * */

	}

}
