class Solution {
    public int maxDepth(String s) {
        int maxO = 0;
        int maxB = 0;
        for(Character c : s.toCharArray()){
            if(c == '('){
                maxO++;
            }
            else if(c == ')'){
                maxB = Math.max(maxO , maxB);
                maxO--;
            }
        }
        return maxB;

    }
}