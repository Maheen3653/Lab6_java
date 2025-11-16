import java.util.Scanner;
	public class Lab6Task1{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		int SENTINEL = 0;
		int max = number;
		int count = 1;
		int maxIndex = 1;

		while(number != SENTINEL){
			if(max < number){
			max = number;
			maxIndex = count;
			}
		number = input.nextInt();
		count++;
		}
		System.out.println("Output: " + maxIndex);
		}
	}	