package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            if (data[0].equals("Add")) {
                wagons.add(Integer.parseInt(data[1]));
            } else {
                int passengers = Integer.parseInt(data[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if ((wagons.get(i) + passengers) <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }

            line = scanner.nextLine();
        }
//        System.out.println(wagons.toString().replaceAll("[\\[\\]\\,]",""));
        wagons.forEach((el -> System.out.print(el + " ")));
    }
}
