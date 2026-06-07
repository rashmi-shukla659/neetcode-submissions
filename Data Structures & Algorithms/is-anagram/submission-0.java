class Solution {
    public boolean isAnagram(String s, String t) {
        int n =s.length();
        int m=t.length();
        if(m!=n){
            return false;
        }
        int[] alp= new int[26];
        char[] sar= s.toCharArray();
        char[] tarr=t.toCharArray();
        for(int i=0;i<n;i++){
            char c=sar[i];
            alp[c-'a']++;
        }
        for(int i=0;i<m;i++){
            char c=tarr[i];
            alp[c-'a']--;
        }
        for(int a:alp){
            if(a!=0){
                return false;
            }
        }

        return true;
    }
}
