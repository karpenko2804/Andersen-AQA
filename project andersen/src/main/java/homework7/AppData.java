package homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppData {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "Пользователь" + separator + "Desktop" + separator + "text.csv.csv";
        File file = new File(path);


        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();


    }

}
//while (scanner.hasNextLine()){
//System.out.println(scanner.nextLine());
//
//   String line = scanner.nextLine();
//        String[] header = line.split("\\;");
//        String[] data = line.split("\\;");     }