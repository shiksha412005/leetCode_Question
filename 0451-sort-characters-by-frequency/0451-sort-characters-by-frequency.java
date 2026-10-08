class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map =  new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c ,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b)-> map.get(b) - map.get(a));
        for(Character c : map.keySet()){
            pq.offer(c);
     
        }
        String res = "";
        while(!pq.isEmpty()){
            Character c = pq.poll();
            int k = map.get(c);
            while(k >= 1){
                res += c;
                k--;
            }
            
        }
        return res;
    }
}