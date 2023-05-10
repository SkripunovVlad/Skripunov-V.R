import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float M[][] = new float[3][2];
        int tochka = 1;
        for(int i = 0; i < 3; i++){
            System.out.println( tochka + "я точка: ");
            tochka++;
            for(int j = 0; j < 2; j++){
                M[i][j] = in.nextInt();
            }
        }
        System.out.println("{" + (M[0][0] + M[1][0] + M[2][0])/3 + "," + (M[0][1] + M[1][1] + M[2][1])/3 + "}");
    }
}
