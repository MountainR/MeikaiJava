import java.util.Scanner;
public class Circle2 {
    public static void main(String[] args){
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = stdIn.nextDouble();

        System.out.println("Perimeter is " + 2 * PI * r + ". ");
        System.out.println("Area is " + PI * r * r + ". ");
    }
}
