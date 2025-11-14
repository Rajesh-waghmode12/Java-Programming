import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileHandling {

    public static void main(String[] args) {

        // try{
        // File file = new File("image2.mp4");
        // if (file.createNewFile()) {
        // System.out.println("file created successfully");
        // } else {
        // System.out.println("File already exits");
        // }
        // } catch (IOException e) {
        // System.out.println("error occured during file creation");
        // e.printStackTrace();
        // }

        // try{
        // FileWriter file = new FileWriter("index.text");
        // file.write("Files in java might be stiky but Not that hard !");
        // file.close();
        // System.out.println("file written successfully");
        // } catch (IOException e) {
        // System.out.println("error occured during file writing");
        // e.printStackTrace();
        // }

        // file writer with try-with-resource

        // try (FileWriter file = new FileWriter("Normal.java")) {
        // file.write("something .......");
        // System.out.println("file written successfully..");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        //file writer for appending the file

        // try (FileWriter file = new FileWriter("index.txt", true)) {
        //     file.write("hey there ");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        
        File file = new File("index.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        // System.out.println(file.getParentFile());
        // System.out.println(file.mkdirs());
        System.out.println(file.canRead());
        System.out.println(file.delete());

        
    
    }
}
