package isInteger;
import java.util.Scanner;
public class IsInteger {
    public boolean isInteger(String s) {
        // Go through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   // get the character at position i

            // If the character is not a digit, then it's not an integer
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // If we never found a non-digit, then it is an integer
        return true;
    }
}
//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//


