import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner dsss = new Scanner(System.in);
        String dsss1 = dsss.nextLine();
        String dsss2 = dsss1.toLowerCase();
        String dsss3 = dsss2.substring(0,1).toUpperCase() + dsss2.substring(1);
        System.out.println("Привет, " + dsss3 + "!");
    }
}
