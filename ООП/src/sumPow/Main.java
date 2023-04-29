package sumPow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter your num");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Result = " + SumPow.sumPow(size, array));
    }

}
