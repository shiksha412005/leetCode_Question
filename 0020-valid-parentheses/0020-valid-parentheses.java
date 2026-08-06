class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(Character ch :  s.toCharArray()){
            if(ch == '{'||ch == '['||ch == '('){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                if((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}')||(st.peek() == '[' && ch == ']')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();

    }
}