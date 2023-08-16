
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int sum;
            for (int j = 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), index};
            }
            numToIndex.put(nums[index], index);
        }

        return null;
    }
}