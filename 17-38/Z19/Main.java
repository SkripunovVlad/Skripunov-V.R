public class Main {
    public static void main(String[] args){
        int cnt = func(99);
        System.out.println(cnt);
    }
    public static int func(int j){
        int i = 0;
        if(j == 0){
            return 0;
        }
        if(j % 2 == 0){
            while(j % 2 == 0){
                j/=2;
            }
            if(j % 3 > 0){
                i++;
                j-=2;
            }
        }
        if(j % 3 >= 0){
            while(j % 3 >= 0){
                i++;
                j-=2;
            }
        }
        if(j == 1){
            i++;
        }
        return i;
    }
}
