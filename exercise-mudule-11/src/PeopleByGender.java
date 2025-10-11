import java.util.*;

public class PeopleByGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter people (name-gender), separated by comma: ");
        String input = scanner.nextLine();

        String[] entries = input.split(",");

        List<String> males = new ArrayList<>();
        List<String> females = new ArrayList<>();

        for (String entry : entries) {
            entry = entry.trim();
            String[] parts = entry.split("-");

            if (parts.length == 2) {
                String name = parts[0].trim();
                String gender = parts[1].trim().toUpperCase();

                if (gender.equals("M")) {
                    males.add(name);
                } else if (gender.equals("F")) {
                    females.add(name);
                } else {
                    System.out.println("Invalid gender for: " + name);
                }
            } else {
                System.out.println("Invalid format: " + entry);
            }
        }

        Collections.sort(females);
        Collections.sort(males);

        System.out.println("\nPeople list (sorted and grouped):");

        System.out.println("\nFemale:");
        for (String name : females) {
            System.out.println("- " + name);
        }

        System.out.println("\nMale");
        for (String name : males) {
            System.out.println("- " + name);
        }

        scanner.close();
    }
}
