class Solution {
    public String removeOuterParentheses(String s) {
       Stack<Character> st = new Stack<>();
        String ans = "";
        for(Character c : s.toCharArray()){
           if(c == '('){
                if(st.isEmpty()){
                    st.push(c);
                }
                else{
                    st.push(c);
                    ans += c;
                }
           }else{
               
                    st.pop();
                    if(!st.isEmpty()){
                        ans += c;
                    }
                    
                

           }
        }
        return ans;
    }
}