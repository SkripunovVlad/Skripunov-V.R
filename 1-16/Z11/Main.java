import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner fv = new Scanner(System.in);
        String fv1 = fv.nextLine();
        String[] sl = new String[] {"я","ю","е","ё","у","э","о","а","и","ы"};
        for(int i = 0; i < sl.length; i++){
            fv1 = fv1.replace(sl[i],"");
        }
        System.out.println(fv1);
    }
}
