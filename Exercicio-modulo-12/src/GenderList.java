import java.util.*;

public class GenderList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> maleNames = new ArrayList<>();
        List<String> femaleNames = new ArrayList<>();

        while (true) {
            System.out.println("Enter a name (or type 'exit' to finish");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("enter the gender (M/F): ");
            String gender = scanner.nextLine().trim();

            if (gender.equalsIgnoreCase("M")) {
                maleNames.add(name);
            } else if (gender.equalsIgnoreCase("F")) {
                femaleNames.add(name);
            } else {
                System.out.println("Invalid gender. Please enter M or F.");
            }

            System.out.println();
        }

        Collections.sort(maleNames);
        Collections.sort(femaleNames);

        System.out.println("\nFemale Names:");
        for (String name : femaleNames) {
            System.out.println("- " + name);
        }

        System.out.println("\nMale Names:");
        for (String name : maleNames) {
            System.out.println("- " + name);
        }

        scanner.close();
    }
}
