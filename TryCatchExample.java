package TryCatch;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	                    
		        Scanner read = new Scanner(System.in);
		        System.out.println("Enter the a and b values: ");
		        try {
		            int a = read.nextInt();
		            int b = read.nextInt();
		            int c = a / b;
		            System.out.println(a + "/" + b +" = " + c);
		        }
		        catch(ArithmeticException ae) {
		            System.out.println("Problem info: Value of divisor can not be ZERO");
		        }  
		    }
		}
