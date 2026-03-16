import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toUpperCase().toCharArray();
        int[] result = new int[26];
        int max = Integer.MIN_VALUE;
        int index = 0;
        int count = 0;
        // 1. 각 단어별로 사용된 횟수 카운팅
        // 2. 가장 많이 카운팅 된 단어가 여러개인지 확인
        // 3. 여러개이면 ? 출력, 1개이면 그 단어 출력 
        for(char c : arr){
            result[c-'A']++;
        }
        for(int i = 0; i < result.length; i++){
            if(result[i] > max){
                max = result[i];
                index = i;
            }
        }
        
        for(int i : result){
            if(max == i){
                count++;
            }
        }

        if(count > 1){
            bw.write("?");
        } else {
            bw.write((char)(index+'A'));
        }



        bw.flush();
        bw.close();

        
    }  
}