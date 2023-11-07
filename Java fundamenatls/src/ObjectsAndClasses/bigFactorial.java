package ObjectsAndClasses;

import java.math.BigInteger;

public class bigFactorial {
    public static void main(String[] args) {
        int n = 5;
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}
