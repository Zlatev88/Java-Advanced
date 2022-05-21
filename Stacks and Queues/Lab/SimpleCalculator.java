package StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String [] input = scanner.nextLine().split("\\s+");

        for (int i = input.length-1; i >= 0; i--) {

            stack.push(input[i]);
        }

        while (stack.size() > 1){

        Integer first = Integer.parseInt(stack.pop());
        String operator = stack.pop();
        Integer second = Integer.parseInt(stack.pop());

        if (operator.equals("+")) {
            int sum = first + second;
            stack.push(String.valueOf(sum));
        }

        else if (operator.equals("-")) {

            int sum = first - second;
            stack.push(String.valueOf(sum));
        }


        }
        System.out.println(stack.peek());
    }
}
