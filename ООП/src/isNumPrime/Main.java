package isNumPrime;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int num = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Num composite ");
        } else {
            System.out.println("Num prime ");
        }
    }
}
