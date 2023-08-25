import java.util.Scanner;
public class ArithDouble {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);  // Create a scanner object
        System.out.println("对x和y进行加减乘除运算。");

        System.out.print("x: ");
        double x = stdIn.nextDouble();  // read x

        System.out.print("y: ");
        double y = stdIn.nextDouble(); // read y

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}
