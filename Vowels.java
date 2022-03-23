package Vowel;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner=new Scanner(System.in);
	       System.out.println("Enter a character : ");//Read a character from user
	       char ch=scanner.next().charAt(0); 
	       scanner.close();

	       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )//Check both uppercase and lowercase 
	            System.out.println(ch + " is a Vowel");//If ch is vowel then display Vowel
	        else
	            System.out.println(ch + " is  a Consonant");

	    }
	}

	                                      
	