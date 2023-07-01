package NestedLoopLab;

public class multiplicationTable {
    public static void main(String[] args) {
        for(int firstNum = 1; firstNum<=10; firstNum++){
            for(int smalNum = 1; smalNum <=10; smalNum++){
                int result = firstNum * smalNum;

                System.out.printf("%d * %d = %d%n", firstNum,smalNum, result);
            }
        }
    }
}
