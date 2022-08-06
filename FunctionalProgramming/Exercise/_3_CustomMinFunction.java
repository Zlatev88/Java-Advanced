package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Function<int [], Integer> func = array -> Arrays.stream(array).min().getAsInt();
        System.out.println(func.apply(arr));
    }
}
