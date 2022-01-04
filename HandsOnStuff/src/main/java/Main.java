import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(;;){
            System.out.println(
                    "1. perimeter of triangle\n" +
                    "2. area of triangle\n" +
                    "3. perimeter of rectangle\n" +
                    "4. area of rectangle\n" +
                    "5. perimeter of circle\n" +
                    "6. area of circle\n" +
                    "7. Celsius to Fahrenheit\n" +
                    "8. Fahrenheit to Celsius\n" +
                    "9. Inches to Centimeters\n" +
                    "0. Centimeters to Inches\n"
            );
            switch (s.nextInt()){
                case 1:
                    System.out.println("enter 3 lengths");
                    System.out.println("perimeter: " + perimeter(s.nextInt(), s.nextInt(), s.nextInt()));
                    break;
                case 2:
                    System.out.println("enter 3 lengths");
                    System.out.println("area: " + area(s.nextInt(), s.nextInt(), s.nextInt()));
                    break;
                case 3:
                    System.out.println("enter 4 lengths");
                    System.out.println("perimeter: " + perimeter(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
                    break;
                case 4:
                    System.out.println("enter 2 lengths");
                    System.out.println("area: " + area(s.nextInt(), s.nextInt()));
                    break;
                case 5:
                    System.out.println("enter 1 length");
                    System.out.println("area: " + perimeter(s.nextInt()));
                    break;
                case 6:
                    System.out.println("enter 1 length");
                    System.out.println("area: " + area(s.nextInt()));
                    break;
                case 7:
                    System.out.println("enter value");
                    System.out.println("Fahrenheit: " + CtoF(s.nextInt()));
                    break;
                case 8:
                    System.out.println("enter value");
                    System.out.println("Celsius: " + FtoC(s.nextInt()));
                    break;
                case 9:
                    System.out.println("enter value");
                    System.out.println("Centimeters: " + ItoC(s.nextInt()));
                    break;
                case 0:
                    System.out.println("enter value");
                    System.out.println("Inches: " + CtoI(s.nextInt()));
                    break;
                default:
            }
            System.out.println("press enter");
            s.nextLine();
            s.nextLine();
        }
    }

    private static double CtoI(int c) {
        return c/2.54;
    }

    private static double ItoC(int i) {
        return i*2.54;
    }

    private static double CtoF(int c) {
        return ((double)c*(9.0/5.0)) + 32;
    }

    private static double FtoC(int f) {
        return (f-32)*(5.0/9);
    }

    private static double area(int r) {
        return Math.PI * Math.pow(r,2);
    }

    private static double perimeter(int r) {
        return 2*r*Math.PI;
    }

    private static double area(int a, int b, int c) {
        double s = perimeter(a,b,c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    private static int area(int a, int b) {
        return a*b;
    }

    private static int perimeter(int a, int b, int c) {
        return a+b+c;
    }

    private static int perimeter(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
