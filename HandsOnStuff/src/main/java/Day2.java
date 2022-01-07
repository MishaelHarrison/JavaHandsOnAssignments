import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (; ; ) {
            System.out.println(
                    "1. find biggest of 3 numbers\n" +
                    "2. display incremental/decremental list of numbers\n" +
                    "3. add two numbers\n"+
                    "4. add n numbers\n"
            );
            switch (s.nextInt()) {
                case 1:
                    System.out.println("enter 3 values: ");
                    System.out.println("Max value is: " + max(s.nextInt(), s.nextInt(), s.nextInt()));
                    break;
                case 2:
                    System.out.println("enter 2 values (first, last): ");
                    System.out.println(numList(s.nextInt(), s.nextInt()));
                    break;
                case 3:
                    System.out.println("enter 2 values");
                    System.out.println(getSum(s.nextInt(), s.nextInt()));
                    break;
                case 4:
                    System.out.println("enter length then values");
                    System.out.println(getSum(Arrays.stream(new int[s.nextInt()]).map(x->s.nextInt()).toArray()));
                    break;
                default:
            }
            System.out.println("press enter");
            s.nextLine();
            s.nextLine();
        }
    }

    private static int max(int a, int b, int c){
        return a>c?a>b?a:b:c>b?c:b;
    }

    private static String numList(int a, int b){
        return (b>a?IntStream.rangeClosed(a, b):IntStream.rangeClosed(b, a).map(x->a+b-x)).mapToObj(x-> x + " (" + (x%2==0?"Even":"Odd")+")").collect(Collectors.joining(", "));
    }

    private static int getSum(int... a){
        Calculator cal = new Calculator();
        Arrays.stream(a).forEach(cal::insertNum);
        return cal.getSum();
    }

    private static class Calculator{
        Node head;

        void insertNum(int num){
            head = new Node(num, head);
        }

        int getSum(){
            Node clone = new Node(0, head);
            int sum = 0;
            while((clone = clone.next) != null)sum += clone.data;
            return sum;
        }

        private static class Node{
            int data;
            Node next;

            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
    }
}
