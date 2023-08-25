import java.util.Scanner;
public class HelloNextLine {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("What is your name: ");
        String s = stdIn.nextLine();

        System.out.println("Hello " + s);
    }

}
