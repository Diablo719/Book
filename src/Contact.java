//POJO -> "plain old java object"
public class Contact {

    int index;
    String name;
    String phoneNumber;

    @Override
    public String toString() {
        return "\nIndex: " + index + "\nName: " + name + "\nPhone number: " + phoneNumber;
    }

}


