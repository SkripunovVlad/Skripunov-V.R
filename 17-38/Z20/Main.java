package Main;
public class Main {
    public static void main(String[] args) {
        int[][] tun = matrix(7, 7);
        print(tun);
    }
    public static int[][] matrix(int m, int h){
        int[][] Mas = new int[m][h];
        int bu = 2;
        int un = 1, kl = 1;
        for(int i = 0; i < Mas.length; i++){
            for(int j = 0; j < Mas[i].length; j++){
                Mas[0][j] = 1;
                Mas[Mas.length - 1][j] = 1;
                Mas[i][0] = 1;
                Mas[i][Mas[i].length - 1] = 1;
            }
        }
        while (un < m && kl < h) {
            for (int i = kl; i < h - 1; i++) {
                Mas[un][i] = bu++;
            }
            un++;
            for (int i = un; i < m - 1; i++) {
                Mas[i][h - 2] = bu++;
            }
            h--;
            if (un < m - 1) {
                for (int i = h - 2; i >= kl; i--) {
                    Mas[m - 2][i] = bu++;
                }
                m--;
            }
            if (kl < h - 1) {
                for (int i = m - 2; i >= un; i--) {
                    Mas[i][kl] = bu++;
                }
                kl++;
            }
        }
        return Mas;
    }
    public static void print(int[][] tt){
        for (int i = 0; i < tt.length; i++) {
            for (int j = 0; j < tt[i].length; j++) {
                System.out.printf("%4d\t", tt[i][j]);
            }
            System.out.println();
        }
    }
}

