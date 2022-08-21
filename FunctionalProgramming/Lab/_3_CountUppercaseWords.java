import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        String [] words = scanner.nextLine().split(" ");

        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));

       // List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split(" ")).filter(isUppercase).collect(Collectors.toList());
        List<String> listUppercaseWords = new ArrayList<>();

        for (String word : words) {
            if (isUppercase.test(word)) {
                listUppercaseWords.add(word);
            }
        }

        System.out.println(listUppercaseWords.size());
        for (String element: listUppercaseWords) {
            System.out.println(element);
        }




    }
}
