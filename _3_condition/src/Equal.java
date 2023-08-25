import java.util.Scanner;
public class Equal {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int a: "); int a = stdIn.nextInt();
        System.out.print("Int b: "); int b = stdIn.nextInt();

        if (a == b)
            System.out.println("Equal.");
        else
            System.out.println("Unequal.");
    }
}
