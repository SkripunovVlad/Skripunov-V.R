import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] fv;
        String sj;
        String[] rm;
        Scanner scan = new Scanner(System.in);
        sj = scan.nextLine();
        rm = sj.split(" ");
        fv = new int[rm.length];
        int ass = 0;
        for (int i = 0; i < rm.length; i++){
            fv[i] =  Integer.parseInt(rm[i]);
            int gm = fv[i] * fv[i];
            ass += gm;
        }
        System.out.println(ass);
    }
}
