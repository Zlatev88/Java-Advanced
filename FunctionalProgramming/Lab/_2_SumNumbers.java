import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _2_SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Function<int [], Integer> getSum = (int [] arr) -> {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            return sum;

        };

        Function<int [], Integer> getCount = (int [] arr) ->  arr.length;

        System.out.println("Count = " + getCount.apply(numbers));
        System.out.println("Sum = " + getSum.apply(numbers));

    }
}
