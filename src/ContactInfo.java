import java.util.HashMap;
import java.util.Map;

public class ContactInfo {

    HashMap<String, String> contacts = new HashMap<String, String>();

    public ContactInfo() {
        contacts.put("BOB", "07970457470");
        contacts.put("SALLY", "07415118642");
        contacts.put("HODOR", "07903245098");
    }

    public String getNumberByName(String name) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String contactName = entry.getKey();
            String contactNumber = entry.getValue();
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
