import java.util.Scanner;
public class PositiveNot {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("Positive.");
        else
            System.out.println("Negative or 0.");

    }
}
