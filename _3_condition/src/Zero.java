import java.util.Scanner;
public class Zero {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int n = stdIn.nextInt();

        if(!(n != 0))
            System.out.println("It is 0.");
        else
            System.out.println("It isn't 0.");
    }
}
