// 20. Valid Parentheses
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.


class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> b=new HashMap<>();
        b.put(')','(');
        b.put(']','[');
        b.put('}','{');

        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);

            }
            else if(c==')'||c=='}'||c==']'){
                if(st.isEmpty())return false;
                if(st.pop()!=b.get(c)){
                    return false ;
                }
            }   

        }
        return st.isEmpty();
    }
}
