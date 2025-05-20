import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class FakeDictionary {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;
        String line;
        HashSet<String> words = new HashSet<String>();
        Scanner input = new Scanner(System.in);

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            while ((line = inputStream.readLine()) != null) {
                words.add(line);
            }
            System.out.println("Please enter a sentence: ");
            String[] st = input.nextLine().split(" ");
            for (int i = 0; i < st.length; i++) {
                String marker = (words.contains(st[i].toLowerCase()) ? "<valid>" : "<invalid>");
                System.out.println((i + 1) + ". " + st[i] + " " + marker);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        } finally {
            if (inputStream != null) {
                inputStream.close();
                input.close();
            }
        }
    }
}