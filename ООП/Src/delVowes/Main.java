package delVowes;
import java.util.Scanner;

public class Main {
    private static final char [] array = {'а', 'у', 'о' ,'ы','э','я','ю','ё','и','е'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = sc.nextLine();
        String result = "";
        int check = 0;
        char checkLetter;
        for (int i = 0; i < text.length(); i++) {
            check = 0;
            checkLetter = text.charAt(i);
            for (int j = 0; j < array.length; j++) {
                if (checkLetter == array[j]) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                result = result + checkLetter;
            }
        }
        System.out.println(result);
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
