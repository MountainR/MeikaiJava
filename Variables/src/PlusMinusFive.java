import java.util.Random;
import java.util.Scanner;
public class PlusMinusFive {
    public static void main(String[] args){
        // Scan a num
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Int: ");
        int num = stdIn.nextInt();

        // Get a random number
        Random rand = new Random();
        int left = num - 5;
        int right = num + 5;
        int random_num = rand.nextInt(right - left + 1) + left;

        System.out.println("生成了该值正负5范围内的随机数，是" + random_num);

    }
}
