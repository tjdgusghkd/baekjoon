import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        
        int[] intArr = new int[N];
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        for(int i = 0; i < intArr.length; i++){
            if(map.containsKey(M-intArr[i])){
                result++;
            }
            map.put(intArr[i], 1);

        }
        
        bw.write(result+"");
        
        bw.flush();
        bw.close();

        
    }  
}