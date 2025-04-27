import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] alpha = new char[26];
        int a = 97;
        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = (char)a;
            a++;
        }

       for(int i = 0; i < alpha.length; i++) {
            int result = -1;    
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == alpha[i]) {
                    result = j;
                    break;
                }
            }
            System.out.print(result + " ");
       }
       

        
        
    }
}