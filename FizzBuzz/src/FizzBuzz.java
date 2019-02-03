import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fizz & Buzz");
		System.out.print("Input numbers to play the game: ");
			
		try {       
			while(input.hasNext()){
				int n=input.nextInt();
				if (n % 15 == 0) {
					System.out.println("FizzBuzz");
				} else if ( n % 3 == 0) {
					System.out.println("Fizz");
				} else if ( n % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(n);
				} 
			}
		} catch (InputMismatchException exception){
		    System.out.println("Only numbers and spaces are accepted. Try adding: 1 3 5");
		}
	}
}