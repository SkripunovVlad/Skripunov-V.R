import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        double[] Fv = new double[3];
        for (int i = 0; i < 3;i++){
            Fv[i] = ss.nextInt();
            if (Fv[0] + Fv[1] > Fv[2] &
                    Fv[1] + Fv[2] > Fv[0] &
                    Fv[0] + Fv[2] > Fv[1]){
                double c1 = (Fv[0]*Fv[0] + Fv[1]*Fv[1] - Fv[2]*Fv[2])/(2*Fv[0]*Fv[1]);
                double c2 = (Fv[1]*Fv[1] + Fv[2]*Fv[2] - Fv[0]*Fv[0])/(2*Fv[1]*Fv[2]);
                double c3 = (Fv[0]*Fv[0] + Fv[2]*Fv[2] - Fv[1]*Fv[1])/(2*Fv[0]*Fv[2]);
                double[] its = new double[] {c1,c2,c3};
                double max = Arrays.stream(its).max().getAsDouble();
                double he = Math.acos(max);
                System.out.println(180 - he*180.0d/Math.PI);
            }
        }
    }
}
