import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        SolutionTwoSum sol = new SolutionTwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found with the given target.");
        }
    }
}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newnum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (newnum.containsKey(complement)) {
                return new int[]{i, newnum.get(complement)};
            }
            newnum.put(nums[i], i);
        }
        return new int[]{}; // return empty array if no solution
    }
}
