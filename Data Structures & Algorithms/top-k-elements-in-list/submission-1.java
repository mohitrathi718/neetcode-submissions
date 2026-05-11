class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];
        int index = 0;

        while (k > 0) {

            int maxFreq = 0;
            int element = 0;

            
            for (int key : map.keySet()) {

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            ans[index] = element;
            index++;

            map.remove(element);

            k--;
        }

        return ans;
    }
}