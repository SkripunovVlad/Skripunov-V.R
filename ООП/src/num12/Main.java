package num12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter final num: ");
        int finalNum = sc.nextInt();
        System.out.println("Enter step num:");
        int step = sc.nextInt();
        String output = "";
        for(int i = 1; i <= finalNum; i += step){
            output += (int) Math.pow(i, 2) + ", ";
        }
        System.out.println(output);
      }
}
