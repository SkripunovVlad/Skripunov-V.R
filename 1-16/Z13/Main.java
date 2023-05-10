import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        int num1 = gg.nextInt();
        int num2 = gg.nextInt();
        int num3 = gg.nextInt();
        int i = 0;
        if(num1 < num2){
            if(num2 < num3){
                while(i < num3){
                    System.out.println(num1);
                    i++;
                    num1 += num2;
                }
            }
        }
    }
}
