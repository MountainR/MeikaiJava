import java.util.Scanner;
public class Hello2_10 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Surname: ");
        String sur = stdIn.nextLine();

        System.out.print("Forename: ");
        String fore = stdIn.nextLine();

        System.out.println("Hello " + fore + " " + sur);
    }
}
