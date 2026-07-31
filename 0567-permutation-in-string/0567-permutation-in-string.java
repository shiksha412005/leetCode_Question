class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;

        int[] freqs1 = new int[26];
        int[] freqW = new int[26];
        for(int k = 0 ; k < s1.length() ; k++){
            freqs1[s1.charAt(k)-'a']++;
        }
        int i = 0;
        int j = 0;

        while(j < s2.length()){
            
            freqW[s2.charAt(j)-'a']++;

            if(j-i+1 == s1.length()){
                if(Arrays.equals(freqs1, freqW)){
                    return true;
                }
                freqW[s2.charAt(i)-'a']--;
                i++;
                
            }  
            j++;          
        }
        return false;
    }
}