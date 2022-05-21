package StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            int index = i;

            if (current == '(') {

                stack.push(index);

            }
            else if (current== ')') {
                int startIndex = stack.pop();
                String contents = text.substring(startIndex, index + 1);
                System.out.println(contents);
            }

        }
    }
}
