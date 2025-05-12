import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTXTExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        File file = new File("data.txt"); // Make sure this file is in the root directory of your Codespace
        Scanner scanner = new Scanner(file);

            // Read each line and convert to integer
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    animals.add(line);
                }
            }

            scanner.close();
        

        // Output the result
        System.out.println("Animlas read from file: " + animals);
    }
}
