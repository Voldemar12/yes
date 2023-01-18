import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {


            String file = new String("C:\\Users\\user\\IdeaProjects\\yes\\text.txt");
            String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\Кто я.txt")));
            int a = 0;
            String[] array = string.split("\\s\\W");
            for (int i = 0; i < array.length; i++) {

               if (Integer.parseInt(array[i]) == 0) {
                   System.out.println(a);
                   break;
            } else if (Integer.parseInt(array[i]) % 2 == 0) {
                   a++;
               }

        }





    }
}