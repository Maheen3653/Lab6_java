import java.util.Scanner;

public class Lab6Task4part5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5 - row; column++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= 2 * row - 1; column++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}