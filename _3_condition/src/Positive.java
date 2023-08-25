// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int: ");
        int n = stdIn.nextInt();

        if(n > 0){
            System.out.println("It is positive. ");
        }


    }
}