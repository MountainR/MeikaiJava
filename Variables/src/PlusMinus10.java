import java.util.Scanner;

public class PlusMinus10 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int x = stdIn.nextInt();

        int plus10 = x + 10;
        int minus10 = x - 10;

        System.out.println("The result of adding 10 is " + plus10 + ". ");
        System.out.println("The result of reducing 10 is " + minus10 + ". ");
    }
}
