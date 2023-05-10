import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args){
        String fv1 = line("abc abc ab abc ab acs acs");
        System.out.println(fv1);
    }
    public static String line(String fv1){
        String fv="";
        String[] att=fv1.split(" ");
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        for (int i = 0; i < att.length; i++) {
            ls.add(att[i]);
        }
        for(String f:ls){
            fv=fv+f+" ";
        }
        return fv;
    }
}
