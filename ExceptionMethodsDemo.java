package Execption;

public class ExceptionMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array1 = { 2, 4, 6, 7, 8 };
		  
		  
		        int[] array2 = { 1, 2, 3, 4, 5 };
		      
		        int[] ans = null;
		        try {
		            for (int i = 0; i < 5; i++) {
		                ans[i] = array1[i] / array2[i];
		                
		                Integer.parseInt("JAVA PROGRAM");
		            }
		        }
		        catch (ArithmeticException error) {
		            System.out.println(
		                "The catch block with Arithmetic Exception is executed");
		        }
		        catch (NullPointerException error) {
		            System.out.println(
		                "The catch block with Null Pointer Exception is executed");
		        }
		        catch (ArrayIndexOutOfBoundsException error) {
		            System.out.println(
		                "The catch block with Array Index Out Of Bounds Exception is executed");
		        }
		        catch (NumberFormatException error) {
		            System.out.println(
		                "The catch block with Number Format Exception is executed");
		        }
		        // Executes when an exception which
		        // is not specified above occurs
		        catch (Exception error) {
		            System.out.println(
		                "An unknown exception is found "
		                + error.getMessage());
		        }
		  
		        // Executes after the catch block
		        System.out.println("End of program");
		    }
		
	}


