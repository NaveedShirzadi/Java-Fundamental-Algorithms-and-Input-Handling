package isInteger;

public class IsInteger {
    public boolean isInteger(String s) {
        if (s == null || s.isEmpty()) {
            return false; // null or empty string is not an integer
        }

        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }

        return true;
    }

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//

}
