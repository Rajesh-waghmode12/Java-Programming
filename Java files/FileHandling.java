import java.io.File;
import java.io.IOException;



public class FileHandling {
    

    public static void main(String[] args) {
        
        try{
            File file = new File("index.txt");
            if (file.createNewFile()) {
                System.out.println("file created successfully");
            } else {
                System.out.println("File already exits");
            }
        } catch (IOException e) {
            System.out.println("error occured during file creation");
            e.printStackTrace();
        }
        
    }

}
