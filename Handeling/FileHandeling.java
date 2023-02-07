import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileHandeling {
    public static void main(String[] args) throws IOException {
        //String newFile = "Hello.txt";
        File file = new File("Hello.txt");

        //presence of file
        if(file.exists()) {
            System.out.println(file+" exits");
        }else {
            System.out.println("not exists");
        }

        //radable or not
        if(file.canRead()) {
            System.out.println(file+" is Readable ");
        }else {
            System.out.println("file is not readable");
        }

        //for deleting
        // if(file.delete()) {
        //     System.out.println(file+" deleted successfully");
        // }else {
        //     System.out.println("is not deleteable");
        // }

        File secondFile = new File("meowTo.txt");
        if(secondFile.createNewFile()) {
            System.out.println(" created a new file");
        }else {
            System.out.println("not able to create a new file");
        }

        //for reading
        Scanner readMe = new Scanner(secondFile);
        while(readMe.hasNextLine()) {
            System.out.println(readMe.nextLine());
        }
        readMe.close();

        FileWriter Iwrite = new FileWriter("meowTo.txt");
        Iwrite.write("I live in Kathmandu");
        Iwrite.close();

        while(readMe.hasNextLine()) {
            System.out.println(readMe.nextLine());
        }
        readMe.close();
    }
}