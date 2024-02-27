//public class ContactFormatter {

 //   private String divider = "|";

//    public Contact getContactFromSingleLine(String line) {
//        String[] values = line.split(divider);
//
//        String index = values[0];
//        String firstName = values[1];
//        String lastName = values[3];
//        String phoneNumber = values[4];
//
//
//        Contact contact = new Contact();
//        contact.index = Integer.parseInt(index);
//        contact.firstName = firstName;
//        contact.lastName =lastName;
//        contact.phoneNumber = phoneNumber;
//
//        return contact ;
//    }

//    public String mapContactToSingleLine(Contact getContactFromSingleLine) {
//      //  String index = String.valueOf(getContactFromSingleLine.index);
//        String firstName = getContactFromSingleLine.firstName;
//        String lastName = getContactFromSingleLine.lastName;
//        String phoneNumber = getContactFromSingleLine.phoneNumber;
//
//        return index + divider + firstName + lastName + divider + phoneNumber;
//    }
//}
