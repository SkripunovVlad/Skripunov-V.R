package sumPow;

public class SumPow {
    public static double sumPow(int size, int array[]) {
        double count = 0;
        int a;
        for (int i = 0; i < array.length; i++) {
            a = array[i];
            count = (int) (count + Math.pow(a, 2));
        }
        return count;
    }
}
