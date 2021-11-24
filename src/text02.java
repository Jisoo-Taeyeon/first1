import java.io.FileReader;
import java.io.IOException;
public class text02 {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader =new FileReader("d:/lh.txt");
            char c=(char)reader.read();
            System.out.println(" "+c);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader!=null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
