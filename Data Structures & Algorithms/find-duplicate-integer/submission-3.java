class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] rep=new int[n+1];
        for(int i=0;i<n;i++){
            
            int temp=nums[i];
            rep[temp]++;
            if(rep[temp]>1){
                return temp;
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(rep[i]);
        //     if(rep[i]>1){
        //         return i;
        //     }
        // }
        return -1;
    }
}
