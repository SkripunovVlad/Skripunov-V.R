import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] Mas0 = new int[] {7,30,54,125,168,10,17, 89, 90};
        int[] Mas1 = leftArray(Mas0);
        int[] Mas2 = rightArray(Mas0);
        System.out.println(Arrays.toString(Mas1)+ " " + Arrays.toString(Mas2));
    }
    public static int[] leftArray(int[] Mas){
        for(int i = 0; i < Mas.length; i++){
            if(Mas[i] == Arrays.stream(Mas).max().getAsInt()){
                Mas = Arrays.copyOf(Mas,i);
            }
        }
        return Mas;
    }
    public static int[] rightArray(int[] mff){
        int idx = -1;
        for (int i = 0; i < mff.length; i++) {
            if(mff[i] == Arrays.stream(mff).max().getAsInt()){
                idx = i;
            }
        }
        int[] g = Arrays.copyOfRange(mff, idx+1, mff.length);
        return g;
    }
}
