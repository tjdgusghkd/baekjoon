import java.util.*;

public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int C = sc.nextInt();
     sc.nextLine();
     List<Float> list = new ArrayList<Float>();

     String[] arr = new String[C];
     for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextLine();
     }

     for(int i = 0; i < arr.length; i++){
        float sum = 0;
        int count = 0;
        String[] newArr = arr[i].split(" ");
        for(int j = 1; j < newArr.length; j++){
            sum+= Integer.parseInt(newArr[j]);
        }
       float avg = sum/Integer.parseInt(newArr[0]);   

       for(int k = 1; k < newArr.length; k++){
            if(Integer.parseInt(newArr[k]) > avg){
                count++;
            }
       }
       list.add((count / Float.parseFloat(newArr[0]))*100);
     }

     for(float f : list){
        System.out.printf("%.3f%%\n", f);
     }
     
    }  
}