import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class Palindrom {
    public boolean isPalindrom(int x) {
        if (x < 0) {
            return false;
        }

        String numStr = Integer.toString(x);
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}