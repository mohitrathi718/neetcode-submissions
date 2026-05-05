class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int num : nums){

            map.put(num,map.getOrDefault(num,0)+1);


        }

        int maxfre=-1;
        int res=0;

        for(int key : map.keySet()){
            if(map.get(key)>maxfre){
                maxfre=map.get(key);
                res=key;
            }
        }
        return res;
    }
}