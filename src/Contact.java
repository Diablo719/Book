//POJO -> "plain old java object"
public class Contact {

    int index;
    String firstName;
    String lastName;
    String phoneNumber;

    public Contact(int index, String firstName, String lastName, String phoneNumber) {
        this.index = index;

        this.firstName = firstName;

        this.lastName = lastName;

        this.phoneNumber = phoneNumber ;
    }

    private String divider = "|";

    @Override
    public String toString() {
        return index + divider + firstName + divider + lastName + divider + phoneNumber ;
    }


    public Contact(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}


//    @Override
//    public String toString() {
//        return "\nIndex: " + index + "\nName: " +firstName + lastName + "\nPhone number: " + phoneNumber;
//
//    }
