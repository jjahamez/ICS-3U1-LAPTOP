import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BufferedReader inputStream = null;
        String line = null;
        HashSet<String> words = new HashSet<>(); //hashset declaration 

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));

            while ((line = inputStream.readLine()) != null) {
                words.add(line); // adds words in dictionary.txt to the hashset
            }
        } catch (FileNotFoundException err) {
            System.out.println("Error opening File");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        System.out.println("Please input an English Sentence (no punctuation):");
        String[] sentence = input.nextLine().trim().split("\\s+");
        input.close();
        for (int i = 0; i < sentence.length; i++) { // ^removes extra spaces and splits words // <numbers each word
            if (words.contains(sentence[i].toLowerCase())) { // checks specific word
                System.out.println((i + 1) + ". " + sentence[i] + " <valid>");
            } else {
                System.out.println((i + 1) + ". " + sentence[i] + " <invalid>");
            }
        }
    }
}