import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Person> people = new ArrayList<>();

       while (true) {
           System.out.print("Enter name (or type 0 to exit): ");
           String name = scanner.nextLine();

           if (name.equals("0")) {
               break;
           }

           System.out.print("Is this person individual or legal? (i/l, 0 to exit(: ");
           String type = scanner.nextLine();

           if(type.equals("0")) {
               break;
           }

           if (type.equalsIgnoreCase("i")) {
               System.out.print("Enter CPF: ");
               String cpf = scanner.nextLine();
               people.add(new IndividualPerson(name, cpf));
           } else if (type.equalsIgnoreCase("l")) {
               System.out.print("Enter CNPJ: ");
               String cnpj = scanner.nextLine();
               people.add(new LegalPerson(name, cnpj));
           } else {
               System.out.println("Invalid type. Try again...");
           }

           System.out.println();
       }

       System.out.println("\n=== People Registered ===");
       for (Person p : people) {
           p.showInfo();
           p.specificInfo();
           System.out.println("-----------------");
       }

       scanner.close();
    }
}

