import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] arr = br.readLine().split(" ");
            int size = Integer.parseInt(arr[0]);
            int len = arr[1].length();
            for(int j = 0; j < len; j++){
                for(int k = 0; k < size; k++){
                    sb.append(arr[1].charAt(j));
                }
            }
            System.out.println(sb);
            sb.delete(0, sb.length());
        }
        
    }  
}