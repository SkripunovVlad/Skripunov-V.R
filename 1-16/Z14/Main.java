package z14;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        System.out.println("Количество: ");
        int size = gg.nextInt();
        z14 array = new z14(size);
        System.out.println("Full");
        while(true){
            System.out.println(Arrays.deepToString(array.array1()));
        }
    }
}
