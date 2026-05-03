

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            int need = target - nums[i]; // number we need

            if (map.containsKey(need)) {
                return new int[]{ map.get(need), i };
            }

            map.put(nums[i], i); // store number with index
        }

        return new int[]{};
    }
}