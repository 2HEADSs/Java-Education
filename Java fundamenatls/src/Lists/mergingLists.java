package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sortedA = new ArrayList<>(Arrays.asList(10,6,3,2,1));
        List<Integer> sortedB = new ArrayList<>(Arrays.asList(9,8,4,0));

        List<Integer> merged = new ArrayList<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < sortedA.size() ||indexB < sortedB.size()){
            int a = sortedA.get(indexA);
            int b = sortedA.get(indexB);
            if(a > b){
                merged.add(a);
                indexA++;
            } else {
                merged.add(b);
                indexB++;
            }
        }



        for(int number:merged){
            System.out.println(number + " ");
        }
    }

}
