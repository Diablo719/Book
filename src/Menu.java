import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu() {

        char chocie = 'x';

        while (chocie != '6') {
            if (App.listContact.isEmpty()) {
                App.listContact = FileReader.readingFile();
            }
            chocie = menuGraphic();
            switch (chocie) {
                case '1':
                    FileReader.readData();
                    break;
                case '2':
                    AddContact.addData();
                    break;
                case '3':
                    AddContact.removeData();
                    break;
                case '4':
                    AddContact.dataSave();
                    break;
                case '5':
                    FileManager.deleteAllContacts(App.path);
                    break;
                case '6':
                    System.out.println("App Closed");
                    break;
            }
        }
    }


    public static char menuGraphic() {
        Scanner scanner = new Scanner(System.in);
        char opcja = 'x';
        while (!"123456".contains(Character.toString(opcja))) {
            System.out.println("------------------------------");
            System.out.println(" Menu ");
            System.out.println("1 - Show Contacts");
            System.out.println("2 - Add Contact");
            System.out.println("3 - Remove Contact");
            System.out.println("4 - Save Contacts");
            System.out.println("5 - Remove all Contacts");
            System.out.println("6 - Close App ");
            System.out.print("= ");
            opcja = scanner.next().charAt(0);
        }
        return opcja;
    }


}










