import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RomanToString {

    public int romanToString(String s) {
        HashMap<String, Integer> romanValues = new HashMap<>();
        romanValues.put("I", 1);
        romanValues.put("V", 5);
        romanValues.put("X", 10);
        romanValues.put("L", 50);
        romanValues.put("C", 100);
        romanValues.put("D", 500);
        romanValues.put("M", 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (romanValues.get(String.valueOf(s.charAt(i))) < romanValues.get(String.valueOf(s.charAt(i + 1)))) {
                sum -= romanValues.get(String.valueOf(s.charAt(i)));
            } else {
                sum += romanValues.get(String.valueOf(s.charAt(i)));
            }
        }

        sum += romanValues.get(String.valueOf(s.charAt(s.length() - 1)));

        return sum;

    }
}


