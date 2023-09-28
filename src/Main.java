import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the person"
                + " whose number you wish to retrieve: ");
        String name = scanner.nextLine().toUpperCase().trim();


        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        names.add("BOB");
        names.add("SALLY");
        names.add("HODOR");
        number.add("07970457470");
        number.add("07415118642");
        number.add("07903245098");git

        boolean found = false;

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                System.out.println("Number: " + number.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This name does not exist");
        }

    }

}
