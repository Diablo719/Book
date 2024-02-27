import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
    public static ArrayList<Contact> readingFile() {

        Path wayToFile = Paths.get(App.path);
        ArrayList<Contact> contacts = new ArrayList<>();

        try {
            ArrayList<String> reading = new ArrayList<>(Files.readAllLines(wayToFile));
            App.way = reading.remove(0);
            contacts = objList(reading);
        } catch (IOException ex) {
            System.err.println("Error read file!");
        } catch (NumberFormatException ex) {
            System.err.println("Error format data!");
        }

        return contacts;
    }
    public static void readData() {
        //  System.out.println(way.replace("|", "\t"));
        System.out.println(App.way);
        System.out.println("------------------------------");
        for (Contact contact : App.listContact) {
            System.out.println(contact.toString());
        }
    }
    public static ArrayList<Contact> objList(ArrayList<String> reading) {
        ArrayList<Contact> contacts = new ArrayList<>();
        for (String line : reading) {
            String[] l = line.split("\\|");
            try {
                Contact contact = new Contact(Integer.parseInt(l[0]), l[1], l[2], l[3]);
                contacts.add(contact);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Error processing line!" + line);
            }
        }
        return contacts;

    }}
