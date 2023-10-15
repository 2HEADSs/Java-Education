 package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersAsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")){
            String [] data = line.split("\\s+");
            String command = data[0];
            switch (command){
                case "Delete":
                    int elementForRemove = Integer.parseInt(data[1]);
                    for (int i = 0; i < numbersAsList.size(); i++) {
                        if(numbersAsList.get(i) == elementForRemove){
                            numbersAsList.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int indexToAdd = Integer.parseInt(data[2]);
                    int elementToAdd = Integer.parseInt(data[1]);
                    if(indexToAdd <= numbersAsList.size()){
                        numbersAsList.add(indexToAdd, elementToAdd);
                        break;
                    }

            }
            line = scanner.nextLine();
        }
        numbersAsList.forEach((el -> System.out.print(el + " ")));

    }
}
