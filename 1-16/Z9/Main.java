import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        String fv1 = gg.nextLine();
        String fv2 = gg.nextLine();
        boolean fv = fv1.endsWith(fv2);
        System.out.println(fv);
    }
}
