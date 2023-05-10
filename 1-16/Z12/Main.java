import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        int num1 = gg.nextInt();
        int num2 = gg.nextInt();
        if(num1 < num2){
            while(num1 <= num2){
                System.out.println(num1*num1);
                num1++;
            }
        }
        if(num2 < num1){
            while(num2 <= num1){
                System.out.println(num2*num2);
                num2++;
            }
        }
    }
}
