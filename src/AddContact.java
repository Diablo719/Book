import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {


    public static void addData() {
        int newId = maxId() + 1;

        Contact newContact= new Contact(newId);
        Scanner sc = new Scanner(System.in);

        System.out.println("Add FirstName");
        newContact.setFirstName(sc.nextLine());

        System.out.println("Add Lastname");
        newContact.setLastName(sc.nextLine());

        System.out.println("Add Phonenumber");
        newContact.setPhoneNumber(sc.nextLine());

        App.listContact.add(newContact);
    }

    public static int maxId() {
        int max = 0;
        for (Contact contact : App.listContact) {
            if (contact.getIndex() > max) {
                max = contact.getIndex();
            }
        }
        return max;
    }


    static void dataSave() {
        Path wayToFile = Paths.get(App.path);
        System.out.println("If you want to save, press Enter");

        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        if (!sc.isEmpty()) {
            wayToFile = Paths.get(sc);
        }
        ArrayList<String> out = new ArrayList<>();
        out.add(App.way);
        for (Contact contact : App.listContact) {
            out.add(contact.toString());
        }
        try {
            Files.write(wayToFile, out);
        } catch (IOException ex) {
            System.out.println("Error save file!");
        }
    }

    static void removeData() {

        FileReader.readData();
        System.out.println("Give the index of the contact, you want to remove");

        Scanner skaner = new Scanner(System.in);
        int number = Integer.parseInt(skaner.nextLine());

        boolean remove = false;

        for (Contact contact : App.listContact) {

            if (contact.getIndex() == number) {
                App.listContact.remove(contact);
                remove = true;

                break;
            }
        }
        if (remove) {
            System.out.println("Contact index " + number + " removed");

        } else {
            System.out.println(" There is no contact under this index " + number);
        }
    }
}
















// System.out.println("Podaj ścieżkę i plik do zapisu");
// System.out.println("Jeśli chcesz zapisać do bieżącego pliku: \n" + App.path + "\n wciśnij enter");
//
//    public static void addNewCont(String path, String newLine) throws IOException {
//        FileWriter fileWriter = new FileWriter(path);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        FileManager fileManager = new FileManager();
//        String s = fileManager.readAll(path).toString();
//        LinkedList<String> cars = new LinkedList<String>();
//
//        if (true){
//            cars.add(newLine);
//             bufferedWriter.newLine();
//
//             bufferedWriter.write(String.valueOf(cars));
//            bufferedWriter.newLine();
//        }else {
//            bufferedWriter.write(newLine);}
//        bufferedWriter.close();
//    }close





//
//    public static void writeSingle() throws IOException {
//        FileWriter fileWriter = new FileWriter(path);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//
//           printWriter.println();
//      // }else {
//        //printWriter.println(contact.toString());}
//       // printWriter.close();
//    }
//
//




