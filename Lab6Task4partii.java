import java.util.Scanner;
	public class Lab6Task4partii{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		for(int row = 1;row <= 5; row++){
			for(int column = 1; column <= row; column++){
			System.out.print("*");
			}
		System.out.println();
		}
		}
	}