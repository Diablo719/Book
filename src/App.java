import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();

        final List<String> strings = fileManager.readAll();

        System.out.println(strings);
    }

    private static void writeSingle(Contact contact) throws IOException {
        FileWriter fileWriter = new FileWriter("contacts.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(contact.toString());
        printWriter.close();
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
