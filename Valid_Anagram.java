import java.util.HashMap;



class Solution {
    public boolean isAnagram(String s, String t) {
         
         if (s.length() != t.length()){
             return false;
         }

       HashMap <Character, Integer> Map = new HashMap <>();
       HashMap <Character, Integer> Try = new HashMap <>();

         for(int i = 0; i < s.length(); i++){
             char c1 = s.charAt(i);
             char c2 = t.charAt(i);

             if (Map.containsKey(c1)){
                 Map.put(c1, Map.get(c1)+ 1);
             } else { 
                 Map.put(c1, 1);
         } 

         if (Try.containsKey(c2)){
             Try.put(c2, Try.get(c2)+ 1);
         } else {
             Try.put(c2, 1);
         }
         
    }

    for(char c: Map.keySet()){
        if(Map.get(c) != Try.get(c)){
            return false;
        }
    }

    return true;
} }