package StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            String [] commands = scanner.nextLine().split(" ");

            if (commands[0].equals("1")) {
                int numToAdd = Integer.parseInt(commands[1]);
                stack.push(numToAdd);
            }
            else if (commands[0].equals("2")) {
                stack.pop();
            }
            else if (commands[0].equals("3")) {
                int maxNumber = Collections.max(stack);
                System.out.println(maxNumber);
            }
        }
    }
}
