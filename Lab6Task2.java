import java.util.Scanner;
	public class Lab6Task2{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sequence of numbers: ");

		int number = sc.nextInt();
		int SENTINEL = 0;
		int count = 1;
		int even = 1;

		while(number != SENTINEL){
			if (number % 2 == 0){
			even = count; 
			count++;
			}
		number = sc.nextInt();
		}
		System.out.println("Output: " + even);

		sc.close();
		}
	}



			
