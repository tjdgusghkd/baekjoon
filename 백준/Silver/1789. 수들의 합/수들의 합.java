import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long count = 0L;
        Long sum = 0L;
       while(true){
            count++;
            sum += count;
            if(sum > n) {
                System.out.println(count -1);
                break;
            } else if(sum == n) {
                System.out.println(count);
                break;
            }
       }
        
    }
}