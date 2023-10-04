import java.util.Random;
import java.util.Scanner;
public class hsj {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
			System.out.println("How are you willing to risk ;)");
			int money= input.nextInt();
	        Random rand = new Random();
			int upperbound = 10, lowerbound = 0;
			
			int number1 = rand.nextInt(upperbound);
			int number2 = rand.nextInt(upperbound);
			int number3 = rand.nextInt(upperbound);
			
			System.out.println(number1 + " || " + number2 + " || " + number3);
			
		
			while (money > 0) {
				if (number1 == 7 || number2 == 7 || number3 == 7) {
					System.out.println("You Won 3€.");
				
					if ((number1 == 7 && number2 == 7) || ((number1 == 7 && number3 == 7) || ((number2 == 7 && number3 == 7)))) {
						System.out.println("You Won 5€.");

				if (number1 == 7 && number2 == 7 && number3 == 7) {
					System.out.println("You Won 10€.");
				
				}
				}
				} else {
					System.out.println("You Lost.");
				}
				
				money--;
				System.out.println("Want to play again?");
			}
		}
	}