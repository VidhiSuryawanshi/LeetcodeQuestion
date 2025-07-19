class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return false;
        }
        s=s.toLowerCase().replaceAll("[^0-9a-zA-Z]","");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
        
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         if(s==null || s.length()==0){
//             return false;
//         }
//         int left=0;
//         int right = s.length()-1;
//         while(left<right){
//             while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
//                 left++;
//             }
//             while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
//                 right--;
//             }
//             if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
//                 return false;
//             }
//             left++;
//             right--;
//         }      
//         return true;  
//     }
// }
