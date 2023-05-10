import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        String fv1 = gg.nextLine();
        String[] fv2 = fv1.split("");
        int j = 0;
        for(int i = 0; i <  fv2.length;i++){
            if(fv2[i].equals(fv2[i].toUpperCase())) {
                j++;
            }
            if(j > fv2.length - j) {
                fv1 = fv1.toUpperCase();
            } else {
                fv1 = fv1.toLowerCase();
            }
        }
        System.out.println(fv1);
    }
}
