
package projectzed.project_zaidi;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner zaidi = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = zaidi.nextInt();
        
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        zaidi.close();
    }
}
