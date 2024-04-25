import java.util.Scanner;
public class Scores{



	public static void main(String... args){

		Scanner scan = new Scanner(System.in);

		int[] scores = new int[10];

			for(int counter = 0; counter < 10 ; counter++){
				System.out.print("Enter scores: ");
				int userInput = scan.nextInt();

				scores[counter] = userInput;
				userInput = scores[counter];




				

			}
				
				for(int counter = 0; counter < 10; counter++){

					if(scores[counter] % 2 == 0){

						
					}
					

					System.out.print(scores[counter] +  " ");

			}
				
				
		}

	}


