import java.util.ArrayList;

public class ContactInfo {

    private ArrayList<MakeInfo> contacts = new ArrayList<>();

    public ContactInfo() {
        contacts.add(new MakeInfo("BOB", "07970457470"));
        contacts.add(new MakeInfo("SALLY", "07415118642"));
        contacts.add(new MakeInfo("HODOR", "07903245098"));
    }

    public String getNumberByName(String name) {
        for (MakeInfo contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.getNumber();
            }
        }
        return null;
    }
}
