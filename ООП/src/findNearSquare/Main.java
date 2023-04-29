package findNearSquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int num = sc.nextInt();
        int findNum = (int) Math.round(Math.sqrt(num));
        System.out.println("Find num is: " + findNum);

    }
}
