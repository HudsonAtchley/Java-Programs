import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile{
    public static void main(String[] args) throws IOException
    {
        File file = new File("E:/Documents/captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while(scan.hasNextLine()){
        fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("E:/Documents/newfile.txt");
        writer.write(fileContent);
        writer.close();
        scan.close();
    }
}