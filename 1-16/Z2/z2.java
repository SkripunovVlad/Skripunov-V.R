import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Чтобы закончить работу программы введите любое число, кроме 1 и 0: ");
        List<String> Sub = new ArrayList<String>();
        var t = in.nextInt();
        int i = 0;
        if (t < 2) {
            if(t==1){
                i++;
                Sub.add("true");
            } else {
                Sub.add("false");
            }

        }
        while (t < 2){
            t = in.nextInt();
            if (t == 1){
                i++;
                Sub.add("true");
            } else {
                Sub.add("false");

            }
        }
        int Pin = Sub.size() - 1;
        Sub.remove(Pin);
        System.out.println(Sub + "\n" + "Сотрудники: " + i);

    }

}
