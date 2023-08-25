import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Find the area of a triangle. ");

        System.out.print("Base: ");
        double base = stdIn.nextDouble();

        System.out.print("Height: ");
        double height = stdIn.nextDouble();

        System.out.println("Area = " + (base * height) / 2 + ". ");
    }
}
