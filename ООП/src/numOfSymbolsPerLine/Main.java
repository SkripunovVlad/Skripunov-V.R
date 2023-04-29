package numOfSymbolsPerLine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Enter your text: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Enter char: ");
        char letter = sc.next().charAt(0);
        System.out.println("Your char repeated " + CountSymbols.countSym(text, letter) + " times");

    }
}
