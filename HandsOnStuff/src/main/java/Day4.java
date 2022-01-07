import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (; ; ) {
            System.out.println(
                    "1. get 2d array info\n"
            );
            switch (s.nextInt()) {
                case 1:
                    System.out.println("enter 2 values (dimensions): ");
                    int x = s.nextInt();
                    int y = s.nextInt();
                    System.out.println("enter " + (x*y) + " values");
                    int[][] arr = Arrays.stream(new int[x][]).map(q->Arrays.stream(new int[y]).map(w->s.nextInt()).toArray()).toArray(int[][]::new);
                    System.out.println(display(arr));
                    System.out.println("sum: " + getSum(arr) + "\nmax: " + getMax(arr) + "\nmin: " + getMin(arr));
                    break;
                default:
            }
            System.out.println("press enter");
            s.nextLine();
            s.nextLine();
        }
    }

    private static String display(int[][] arr){
        return Arrays.stream(arr).map(x->Arrays.stream(x).mapToObj(y->Integer.valueOf(y).toString()).collect(Collectors.joining("\t"))).collect(Collectors.joining("\n"));
    }

    private static int getMin(int[][] arr) {
        return Arrays.stream(arr).map(x->Arrays.stream(x).reduce(Math::min).orElse(Integer.MAX_VALUE)).reduce(Math::min).orElse(Integer.MAX_VALUE);
    }

    private static int getMax(int[][] arr) {
        return Arrays.stream(arr).map(x->Arrays.stream(x).reduce(Math::max).orElse(Integer.MIN_VALUE)).reduce(Math::max).orElse(Integer.MIN_VALUE);
    }

    private static int getSum(int[][] arr) {
        return Arrays.stream(arr).map(x->Arrays.stream(x).reduce(Integer::sum).orElse(0)).reduce(Integer::sum).orElse(0);
    }
}
