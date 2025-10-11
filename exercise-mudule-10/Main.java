import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double grade1, grade2, grade3, grade4;

        System.out.print("Enter the first grade: ");
        grade1 = scanner.nextDouble();
        System.out.print("Enter the second grade: ");
        grade2 = scanner.nextDouble();
        System.out.print("Enter the third grade: ");
        grade3 = scanner.nextDouble();
        System.out.print("enter the four grande: ");
        grade4 = scanner.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("\nAverage: " + average);

        if (average >= 7.0) {
            System.out.println("Result: Approved");
        } else if (average >= 5.0) {
            System.out.println("Result: Recovery");
        } else {
            System.out.println("Result: Reproved");
        }

        scanner.close();
    }
}