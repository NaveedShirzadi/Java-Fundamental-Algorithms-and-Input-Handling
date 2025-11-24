package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)
import java.util.Scanner;
public class IsDivisible {
    public boolean isDivisible(int a, int b) {
        if (b == 0) {
            return false; // can't divide by 0
        }
        return a % b == 0;
    }
}
