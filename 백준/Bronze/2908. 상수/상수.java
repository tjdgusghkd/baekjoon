import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originNum1 = sc.next();
        String originNum2 = sc.next();

        StringBuilder sb1 = new StringBuilder(originNum1);
        int num1 = Integer.parseInt(sb1.reverse().toString());
        StringBuilder sb2 = new StringBuilder(originNum2);
        int num2 = Integer.parseInt(sb2.reverse().toString());

        if(num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }






    }
}