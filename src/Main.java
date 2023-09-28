import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the person"
                + " whose number you wish to retrieve: ");
        String name = scanner.nextLine().toUpperCase().trim();

        String[] names = new String[3];
        String[] number = new String[3];
        names[0] = "BOB";
        names[1] = "SALLY";
        names[2] = "HODOR";
        number[0] = "07970457470";
        number[1] = "07415118642";
        number[2] = "07903245098";

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("Number: " + number[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This name does not exist");
        }

    }

}
