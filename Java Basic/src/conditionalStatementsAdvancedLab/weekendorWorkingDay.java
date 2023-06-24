package conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class weekendorWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOFWeek = scanner.nextLine();

        switch (dayOFWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
