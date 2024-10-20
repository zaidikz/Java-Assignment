package projectzed.project_zaidi;
import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner zaidi = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = zaidi.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        zaidi.close();
    }
}
