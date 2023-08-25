import java.util.Scanner;

public class Minus {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int a = stdIn.nextInt();

        int b = -a;
        System.out.println("Minus " + a + " is " + b + ".");
    }
}
