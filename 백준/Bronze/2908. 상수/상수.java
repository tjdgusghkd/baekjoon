import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder(arr[0]).reverse();
        StringBuilder sb2 = new StringBuilder(arr[1]).reverse();

        int max = Math.max(Integer.parseInt(sb1+""), Integer.parseInt(sb2+""));
        bw.write(max+"");
        bw.flush();
        bw.close();

        
    }  
}