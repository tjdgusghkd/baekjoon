import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();


        if (inputStr.isEmpty()) { 
            System.out.println(0);
        } else {
            System.out.println(inputStr.split(" ").length);
        }
        
        sc.close();
    }
}