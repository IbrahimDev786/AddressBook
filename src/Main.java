import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the person"
                + " whose number you wish to retrieve: ");
        String name = scanner.nextLine().toUpperCase().trim();

        ContactInfo contactInfo = new ContactInfo();

        String number = contactInfo.getNumberByName(name);

        if (number != null) {
            System.out.println("Number: " + number);
        }else{
            System.out.println("This name does not exist");
        }

    }

}
