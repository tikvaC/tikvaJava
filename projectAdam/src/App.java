import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int max = x;
        int max2 = x-1;
        // 1 2 5 4 7 6
        while (x > -1) {
            if(max2 < x){
                if (max < x) {
                    max2 = max;
                    max = x;
                }else if(x != max){
                    max2 = x;
                }
            }
            x=sc.nextInt();
        }

        System.out.println("max : " + max);
    }
}
