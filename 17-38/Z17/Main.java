import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args){
        boolean hah = correctness("(((())()");
        System.out.println(hah);
    }
    public static boolean correctness(String fv){
        while (fv.contains("()")) {
            fv = fv.replaceAll("\\(\\)", "");
        }
        return (fv.length() == 0);
    }
}
