import java.util.Scanner;
	public class Lab6Task3{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sequence of numbers: ");
		
		int number = sc.nextInt();
		int count = 0;
		int preNum = number;
		int SENTINEL = 0;

		while(number != SENTINEL){
			if(preNum < number){
			count++;
			}
		preNum = number;
		number = sc.nextInt();
		}
		System.out.println("Output: " + count);
		}
	}

		
		
		
		
