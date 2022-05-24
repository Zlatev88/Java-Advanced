package StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        String [] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        int N = Integer.parseInt(numbers[0]);
        int S = Integer.parseInt(numbers[1]);
        int X = Integer.parseInt(numbers[2]);
        for (int i = 0; i < N; i++) {
            stack.push(input[i]);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {

            System.out.println(0);
        }

        else {

            if (stack.contains(String.valueOf(X))) {
                System.out.println("true");
            }
            else {
            String minValue = Collections.min(stack);
            System.out.println(minValue);}


        }







    }
}
