import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1. 자리수 입력 받기
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        String input = br.readLine();
        // 2. 입력된 값을 각 자리로 나눠서 합 구해주기
        for(int i = 0; i < input.length(); i++) {
            sum += input.charAt(i) -'0';
        }
        
        bw.write(sum+"");
        bw.flush();
        bw.close();

        
    }  
}