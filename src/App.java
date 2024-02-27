import java.util.ArrayList;

public class App {
    static String path ="./contacts.txt";
    static ArrayList<Contact> listContact = new ArrayList<>();
    static String way;


    public static void main(String[] args)  {

        if(!FileManager.fileExists(path)) {
            FileManager.createFile(path);
        }
         Menu.menu();

    }

}



//0. czy plik istnieje jako baza
//----------------------------------------
//1. nie ma pliku, chcemy przeczytac --> haloo brak bazy danych
//2. jest plik, chcemy przeczytac --> czytamy wszystko na raz
//3. nie ma pliku, chcemy zapisac --> utworzymy plik, zapiszemy jak nizej (kolejna linia)
//4.  *** jest plik, chcemy zapisac --> znalezc metode na dodanie kolejnej linii do pliku ***
//5. nie ma pliku, policz rekordy --> haloo brak rekordow
//5a. jest plik (pusty) --> 0
//6. jest plik, policz rekordy --> ok
//-----------------------------------------
//7. wypisywanie rekordow po kolei
//8. wyszukiwanie rekordow
//9. konstruktor -> file manager calkowicie dla konkretnego pliku






//        int strings = fileManager.countRecords(path)
//        System.out.println(strings);
//        fileManager.createFile(path);
//        PrintWriter printWriter = new PrintWriter(path);
//        printWriter.println("index|imie|nazwisko|numertel");
//        AddContact.writeSingle();

//        Scanner sc = new Scanner(System.in);
//            String n = sc.next();
//            int i = sc.nextInt();
//            String p = sc.next();
//            Contact contact2 = new Contact();
//            contact2.firstName = n;
//            contact2.index = i;
//            contact2.phoneNumber = p;
//        System.out.println(strings);
        //    AddContact.addNewContact(path,contactFormatter.mapContactToSingleLine(contact2));
       // System.out.println(contactFormatter.mapContactToSingleLine(contact2));
      //  AddContact.addNewContact(path,contactFormatter.mapContactToSingleLine(contact2));
//            System.out.println( contactFormatter.mapContactToSingleLine(Contact ccontact2);
       // System.out.println( contactFormatter.mapContactToSingleLine(contact2));
//            AddContact.addNewContact(path,contactFormatter.mapContactToSingleLine(contactFormatter.getContactFromSingleLine(string)));


            // contactFormatter.getContactFromSingleLine(string);

//

         //   System.out.println("");
//        } catch (IOException e) {
//            System.out.println("");
//            e.printStackTrace();
//        }
//    }


      //   final List<String> strings = fileManager.readAll(path);
        //System.out.println();
       // createFile(Path.of("./contacts.txt"));
      // System.out.println(strings);
//    }






