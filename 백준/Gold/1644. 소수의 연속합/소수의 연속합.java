import java.util.*;
import java.io.*;

public class Main {

    static boolean[] isPrime;
    

    static List<Integer> isPrime_check(int n) {
        isPrime = new boolean[n + 1];
        List<Integer> list = new ArrayList<Integer>();
        
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i = 0; i < isPrime.length; i++){
            if(isPrime[i]){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> list = isPrime_check(N);

        


        int left = 0;
        int right = 0;
        int sum = 0;
        while(true){
            if(sum >= N){
                sum -= list.get(left++);
            } else if(right == list.size()){
                break;
            } else {
                sum += list.get(right++);
            }

            if(sum == N) count++;
        }

        bw.write(count+"");
        bw.flush();
        bw.close();

        
    }  
}