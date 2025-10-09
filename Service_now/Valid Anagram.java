// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>c=new HashMap<>();
        for(char ch:s.toCharArray()){
            c.put(ch,c.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!c.containsKey(ch)){
                return false;
            }
            c.put(ch,c.get(ch)-1);
            if(c.get(ch)==0){
                c.remove(ch);
            }
        }
        return c.isEmpty();

    }
}
