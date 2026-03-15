import java.util.*;

public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     int[] arr = new int[26];
     Arrays.fill(arr, -1);
     for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if(arr[ch - 'a'] == -1){
            arr[ch - 'a'] = i;
        } else {
            continue;
        }
     }

     for(int i : arr){
        System.out.printf(i + " ");
     }
    }  
}