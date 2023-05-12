package Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        String m = gg.nextLine();
        String[] as = m.split("");
        String gl = "";
        for(int i = 0; i < as.length; i++){
            int pl = Integer.parseInt(as[i]);
            if(as[i].equals("1")||as[i].equals("2")||as[i].equals("3")) {
                pl += 6;
                gl += pl;
            }
            if(as[i].equals("4")||as[i].equals("5")||as[i].equals("6")||as[i].equals("0")){
                gl += pl;
            }
            if(as[i].equals("7")||as[i].equals("8")||as[i].equals("9")){
                pl -= 6;
                gl += pl;
            }
        }
        System.out.println(gl);
    }
}
