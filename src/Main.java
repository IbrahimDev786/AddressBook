import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the person"
                + " whose number you wish to retrieve: ");
        String name = scanner.nextLine().toUpperCase().trim();

        ArrayList<MakeInfo> contact = new ArrayList<>();

        contact.add(new MakeInfo("BOB", "07970457470"));
        contact.add(new MakeInfo("SALLY", "07415118642"));
        contact.add(new MakeInfo("HODOR", "07903245098"));


        boolean found = false;

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getName().equals(name)) {
                System.out.println("Number: " + contact.get(i).getNumber());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This name does not exist");
        }

    }

}
