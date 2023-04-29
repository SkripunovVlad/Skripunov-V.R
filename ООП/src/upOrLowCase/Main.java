package upOrLowCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println(checkCase(str));
    }
    private static String checkCase(String str) {
        int low = 0;
        int up = 0;
        char check;
        for (int i = 0; i < str.length(); i++) {
            check = str.charAt(i);
            if (check == Character.toLowerCase(check)) {
                low++;
            } else {
                up++;
            }
        }
        if (low >= up) {
            return (str.toLowerCase());
        } else {
            return (str.toUpperCase());
        }
    }
}
