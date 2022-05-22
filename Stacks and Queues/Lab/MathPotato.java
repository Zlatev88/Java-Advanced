package StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        for (int i = 0; i < input.length; i++) {
            queue.add(input[i]);
        }

        while (queue.size()>1) {

            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());

            }
                if (isPrime(cycle)) {

                    System.out.println("Prime " + queue.peek());


                }
                else {

                    System.out.println("Removed " + queue.peek());
                    queue.poll();
                }


                cycle++;




        }
        System.out.println("Last is " + queue.poll());
    }

    public static boolean isPrime (int number) {

    if (number==1) {
        return false;
    }
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
            return  false;}
        }

        return true;
        }




    }
