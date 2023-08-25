import java.util.Random;
public class LuckyNo {
    public static void main(String[] args){
        Random rand = new Random();

        int lucky = rand.nextInt(10);

        System.out.println("Today's lucky number is " + lucky + ". ");
    }
}
