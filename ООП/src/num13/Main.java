package num13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start num: ");
        int start = sc.nextInt();
        System.out.println("Enter step num: ");
        int step = sc.nextInt();
        System.out.println("Enter Quantity num: ");
        int quantityNum = sc.nextInt();
        String output = "";
        for (int i = start; i < quantityNum * step; i+= step){
            output += i + " ";
        }
        System.out.println(output);
    }

}
