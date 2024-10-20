package projectzed.project_zaidi;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner zaidi = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = zaidi.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = zaidi.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = zaidi.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }

        zaidi.close();
    }
}
