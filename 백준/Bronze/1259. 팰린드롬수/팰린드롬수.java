import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String check = "0";
            String str = br.readLine();
            String sb = new StringBuilder(str).reverse().toString();
            if(sb.equals(check)){
                break;
            }

            
            if(str.equals(sb)){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();

        
    }  
}