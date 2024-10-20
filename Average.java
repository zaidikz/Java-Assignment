
package projectzed.project_zaidi;
public class Average{
    public static void main(String[] args) {
        int[] numbers = {10, 12, 34, 23, 56, 78};
        int sum = 0;
        double average;

        for (int i = 0; i < 6; i++) {
            sum = sum + numbers[i];
        }

        average = sum / 6.0;
        System.out.println("The average is: " + average);
    }
}

