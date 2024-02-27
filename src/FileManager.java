import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {

    public List<String> readAll(String path) throws IOException {
        Path filepath = Path.of(path);
        List<String> fileLines = Files.readAllLines(filepath);

        return fileLines;
    }

    public int countRecords(String path) throws IOException {
        Path filepath = Path.of(path);
        List<String> fileLines = Files.readAllLines(filepath);
        int linesNumber = fileLines.size();

        return linesNumber;
    }

    public boolean fileExists(String path) {
        File file = new File(path);

        if (file.exists() && file.isFile()) {
            System.out.printf("File %s exists", path);
            return true;
        }
        System.out.printf("File %s does not exist", path);

        return false;
    }

    public void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.printf("File %s created", path);
        } catch (IOException e) {
            System.out.printf("Error when creating file %s", path);
            throw new RuntimeException(e);
        }
    }

    public void deleteFile(String path) {
        File file = new File(path);
        if (fileExists(path)) {
            file.delete();
            System.out.printf("File %s removed", path);
        } else {
            System.out.printf("File %s does not exist", path);
        }
    }

}
