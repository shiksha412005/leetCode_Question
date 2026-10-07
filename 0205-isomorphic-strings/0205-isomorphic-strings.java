class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> mapS = new HashMap<>();
        HashMap<Character , Character> mapT = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i) , t.charAt(i));
            }else{
                if(t.charAt(i) != mapS.get(s.charAt(i)))return false;
            }
            if(!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i) , s.charAt(i));
            }else{
                if(mapT.get(t.charAt(i)) != s.charAt(i))return false;
            }
        }
        return true;
    }
}