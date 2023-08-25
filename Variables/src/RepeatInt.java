import java.util.Scanner;

public class RepeatInt {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int x = stdIn.nextInt();

        System.out.println("You entered " + x + ". ");
    }
}
