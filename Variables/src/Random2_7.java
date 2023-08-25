import java.util.Random;
public class Random2_7 {
    public static void main(String[] args){
        Random rand = new Random();

        int one_digit_pos = rand.nextInt(9) + 1;
        int one_digit_neg = -(rand.nextInt(9) + 1);
        int two_digits_pos = rand.nextInt(90) + 10;

        System.out.println("一位数的正整数： " + one_digit_pos);
        System.out.println("一位数的负整数： " + one_digit_neg);
        System.out.println("两位数的正整数： " + two_digits_pos);
    }
}
