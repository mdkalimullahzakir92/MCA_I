
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnchekedExction {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        File f = new File("E:\\HAIDER\\MCA\\gitFolder\\java\\info.txt");
        try {
            FileReader r = new FileReader(f);
            System.out.println("thank you");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("print this");
        }

    }
}
