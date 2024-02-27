public class ContactFormatter {

    private String divider = "|";

    public Contact getContactFromSingleLine(String line) {
        String[] values = line.split(divider);

        String index = values[0];
        String name = values[1];
        String phoneNumber = values[2];

        Contact contact = new Contact();
        contact.index = Integer.parseInt(index);
        contact.name = name;
        contact.phoneNumber = phoneNumber;

        return contact;
    }

    public String mapContactToSingleLine(Contact contact) {
        String index = String.valueOf(contact.index);
        String name = contact.name;
        String phoneNumber = contact.phoneNumber;

        return index + divider + name + divider + phoneNumber;
    }
}
