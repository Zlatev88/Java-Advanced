package StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class _6_WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/words.txt"));

        List<String> wordList = new ArrayList<>();
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();

        String line = bf.readLine();

        while (line != null) {

            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {
                wordCount.put(words[i], 0);
            }


            line = bf.readLine();
        }

        BufferedReader bf2 = new BufferedReader(new FileReader("src/text.txt"));

        String line2 = bf2.readLine();
        while (line2 != null) {
            String[] words2 = line2.split(" ");

            wordList.addAll(Arrays.asList(words2));


           line2= bf2.readLine();
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (wordCount.containsKey(wordList.get(i))) {

                wordCount.put(wordList.get(i), wordCount.get(wordList.get(i)) +1 );
            }
        }

        for (var word : wordCount.entrySet()) {
            System.out.printf("%s - %d%n", word.getKey(), word.getValue());
        }

    }
}