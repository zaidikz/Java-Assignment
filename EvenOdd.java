//QUESTION 1
package projectzed.project_zaidi;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner zaidi = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = zaidi.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        zaidi.close();
    }
}

