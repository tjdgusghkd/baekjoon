import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] count = new int[26];
        int result = 0;
        int left = 0;
        int kind = 0;
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if(count[rightChar-'a']==0){
                kind++;
            }
            count[rightChar-'a']++;
            while(kind > n) {
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                if(count[leftChar-'a'] == 0) {
                    kind--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        System.out.print(result);
    }
}
