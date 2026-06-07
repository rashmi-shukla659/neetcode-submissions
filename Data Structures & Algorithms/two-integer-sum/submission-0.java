class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(hash.containsKey(x)){
                return new int[]{hash.get(x), i};
            }
            else{
                hash.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}