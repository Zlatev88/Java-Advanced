package StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class _4_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/input.txt"));
        PrintWriter pw = new PrintWriter("out.txt");

        String line = bf.readLine();
        int vowelCount = 0;
        int punctuationCount = 0;
        int cont = 0;

        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);

                if (isVowel(current)) {
                    vowelCount++;
                }
                else if (isPunctuation(current)) {
                    punctuationCount++;
                }
                else if (current != ' '){
                    cont++;
                }


            }

            line = bf.readLine();
        }
        pw.printf("Vowels: %d%n", vowelCount);
        pw.printf("Consonants: %d%n", cont);
        pw.printf("Punctuation: %d%n", punctuationCount);
        pw.close();
    }
    private static boolean isVowel (char symbol) {
        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            return true;
        }
        else {return false;}
    }
    private static boolean isPunctuation (char symbol) {
        if (symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?') {
            return true;
        }
        else {return false;}
    }
}
