import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class day13 {
    static void main(){
        Path path = Path.of("files","report.txt");
        try{
            List<String> data = Files.readAllLines(path);
            for (String line : data) {
                System.out.println(line);
            }
            List<String> newData = new ArrayList<>();
            newData.add("prasanya");
            newData.add("yazhini");
            newData.add("nafeela");
            newData.add("parasnya");
            newData.add("ashiu");
        } catch (IOException io){
            System.out.println("successfully");
        }
    }

}