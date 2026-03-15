import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str= br.readLine().trim();

        if(str.isEmpty()){
            bw.write("0");
        } else {
            bw.write(String.valueOf(str.split(" ").length));
        }
        

        bw.flush();
        bw.close();

        
    }  
}