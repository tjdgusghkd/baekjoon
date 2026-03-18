import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        int left = 1;
        int right = 1;
        int sum = 1;
        while(left <= N){
            if(sum == N){
                count++;
                sum -= left;
                left++;
            } else if(sum < N){
                right++;
                sum += right;

            } else {
                sum -= left;
                left++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();

        
    }  
}