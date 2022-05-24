package StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            stack.push(number);
        }
        for (String element: stack) {

            System.out.print(element + " ");
        }
    }
}
