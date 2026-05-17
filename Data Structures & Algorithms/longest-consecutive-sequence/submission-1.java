class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set= new HashSet<>();

        int max=0;

        for(int num :nums){
            set.add(num);
        }

        

        for( int num :nums){

            int longs=0;

           int curr=num;

            while(set.contains(curr)){
                longs++;
                curr++;
            }
            max=Math.max(longs,max);
        }
        return max;
    }
}
