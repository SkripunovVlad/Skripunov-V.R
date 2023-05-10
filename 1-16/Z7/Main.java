import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        System.out.println(Math.round(Math.sqrt(num)));
    }
}
