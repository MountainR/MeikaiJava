import java.util.Scanner;
public class SumAve {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("对x和y求和与平均值。");

        System.out.print("x: ");
        double x = stdIn.nextDouble();

        System.out.print("y: ");
        double y = stdIn.nextDouble();

        System.out.println("Sum = " + (x + y));
        System.out.println("Ave = " + ((x + y) / 2));
    }
}
