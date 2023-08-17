import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String firstWord = strs[0];
        List<String> listOfPrefix = new ArrayList<>();

        for (int i = 1; i < strs.length; i++) {
            String prefix = "";
            for (int j = 0; j < Math.min(firstWord.length(), strs[i].length()); j++) {
                if (firstWord.charAt(j) != strs[i].charAt(j)) {
                    break;
                } else {
                    prefix += firstWord.charAt(j);
                }
            }
            listOfPrefix.add(prefix);
        }

        listOfPrefix.sort(Comparator.comparingInt(String::length));

        if (listOfPrefix.isEmpty()) {
            return "";
        }

        return listOfPrefix.get(0);
    }
}
