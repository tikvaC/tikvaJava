import java.util.*;
public class four {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        int x = sc.nextInt();
        int max = x;
        while (x != -1) {

            sum = sum + x;
            count++;
            if(x > max){
                max = x;
            }

            x=sc.nextInt();
        }

        double avg = (double)sum/ count;
        System.out.println(sum +" : sum\n" + count + " : count\n" + max +" :max\n" + avg + ": avg");
    }
}
