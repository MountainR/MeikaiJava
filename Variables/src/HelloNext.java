import java.util.Scanner;
public class HelloNext {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Your name is: ");
        String s = stdIn.next();

        System.out.println("Hello " + s + ". ");
    }
}
