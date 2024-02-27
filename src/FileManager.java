import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

    public static boolean fileExists(String path) {
        File file = new File(path);

        if (file.exists() && file.isFile()) {
            System.out.println("File exists");
            return true;
        }
        System.err.println("File %s does not exist"+ path);

        return false;
    }

    public static void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(path);
            printWriter.println("index|imie|nazwisko|numertel");
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Error when creating file ");
            throw new RuntimeException(e);
        }
    }

    public static void deleteAllContacts(String path){
            File file = new File(path);
            if (fileExists(path)) {
                file.delete();
                System.out.println("Contacts removed");
                createFile(App.path);

                if (!App.listContact.isEmpty()) {
                    App.listContact = FileReader.readingFile();
                }
            } else {
                System.err.println("File does not exist");
            }
    }

}















//

//    public List<String> readAll(String path) throws IOException {
//        Path filepath = Path.of(path);
//        List<String> fileLines = Files.readAllLines(filepath);
//
//        return fileLines;
//    }
//
//    public int countRecords(String path) throws IOException {
//        Path filepath = Path.of(path);
//        List<String> fileLines = Files.readAllLines(filepath);
//        int linesNumber = fileLines.size();
//
//        return linesNumber;
//    }