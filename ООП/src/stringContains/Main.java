package stringContains;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = sc.nextLine();
        System.out.println("Enter ending: ");
        String end = sc.nextLine();
        if (isEnding(str, end)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }






    }

    private static boolean isEnding(String str, String end){
        return str.endsWith(end);
    }
}
