class Solution {
    public boolean palindrome(int i , int j , String s){
        if(i >= j)return true;

        if(s.charAt(i) == s.charAt(j)){
            return palindrome(i+1 , j-1 , s);
        }
        return false;
    }
    public String longestPalindrome(String s) {
        int sp = 0;
        int maxLen = 0;

        for(int i = 0 ; i < s.length() ;i++){
            for(int j = i ; j < s.length() ; j++){
                if(palindrome(i , j , s)){
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp , sp+maxLen);
    }
}