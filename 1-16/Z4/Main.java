public class Main {
    public static void main(String[] args){
        int cnt = str_count("Hello", 'o');
        int cnt1 = str_count("Hello", 'l');
        int cnt2 = str_count("", 'z');
        System.out.println(cnt);
        System.out.println(cnt1);
        System.out.println(cnt2);
    }
    public static int str_count(String str, char fv){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            char V = str.charAt(i);
            if(V == fv) {
                cnt++;
            }
        }
        return cnt;
    }
}
