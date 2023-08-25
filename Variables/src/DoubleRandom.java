import java.util.Random;
public class DoubleRandom {
    public static void main(String[] args){
        Random rand = new Random();

        System.out.println("Random number: ");
        System.out.println("0.0~1.0: " + rand.nextDouble());
        System.out.println("0.0~10.0: " + rand.nextDouble() * 10);
        System.out.println("-1.0~1.0: " + (rand.nextDouble() * 2 - 1));
    }
}
