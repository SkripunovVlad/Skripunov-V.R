import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean cnt = num(15);
        System.out.println(cnt);
    }
    public static boolean num(int x){
        int i = 2;
        while (x % i != 0){
            i++;
        }
        if (i == x){
            return true;
        }
        return false;
    }
}
