class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] rep=new int[n+1];
        for(int i=0;i<n;i++){
            
            int temp=nums[i];
            rep[temp]++;
        //     if(nums[i]==nums[i-1]){
        //         return nums[i];
        //     }
        }
        for(int i=0;i<n;i++){
            System.out.print(rep[i]);
            if(rep[i]>1){
                return i;
            }
        }
        return -1;
    }
}
