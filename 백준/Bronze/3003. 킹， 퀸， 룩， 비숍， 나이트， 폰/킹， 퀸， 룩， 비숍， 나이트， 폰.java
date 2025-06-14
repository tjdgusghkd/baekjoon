import java.util.*;


public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int[] standardPieces = {1, 1, 2, 2, 2, 8};

        int[] foundPieces = Arrays.stream(sc.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        int[] resultPieces = new int[6]; 

        for (int i = 0; i < 6; i++) {
            resultPieces[i] = standardPieces[i] - foundPieces[i];
        }

        Arrays.stream(resultPieces).forEach(num -> System.out.print(num + " ")); 

    }
}