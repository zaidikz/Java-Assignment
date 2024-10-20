package projectzed.project_zaidi;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner zaidi = new Scanner(System.in);
        
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = zaidi.next().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            case 'D':
                System.out.println("You can do better.");
                break;
            case 'F':
                System.out.println("Fail. Please try again.");
                break;
            default:
                System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
        }

        zaidi.close();
    }
}
