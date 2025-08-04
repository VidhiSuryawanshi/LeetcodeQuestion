class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        int []Hash = new int[256];
        Arrays.fill(Hash,0);

        for(char ch:t.toCharArray()){
            Hash[ch]++;
        }
        
        for(char ch:s.toCharArray()){
            Hash[ch]--;
        }

        for(int i=0;i<256;i++){
            if(Hash[i]!=0){
                return false;
            }
        }
        return true;
    }
}