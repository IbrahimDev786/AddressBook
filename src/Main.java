import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the person"
                + " whose number you wish to retrieve: ");
        String name = scanner.nextLine().toUpperCase().trim();

        if (name.equals("BOB")) {
            System.out.println("07970470470");
        } else if (name.equals("SALLY")) {
            System.out.println("07415118642");
        } else {
            System.out.println("This name does not exist");
        }
    }

}
