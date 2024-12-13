# 3. Longest Substring Without Repeating Characters

https://leetcode.com/problems/longest-substring-without-repeating-characters/

## Description


Given a string s, find the length of the longest
substring
without repeating characters.

## Examples

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


## Constraints

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

## Solution


    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp = "";

            for(int j = i; j < s.length(); j++){
                if(temp.indexOf(s.charAt(j)) < 0){
                    //System.out.println("char at " + "j" + ": " + s.charAt(j));
                    temp = temp +  s.charAt(j);
                    longest = (temp.length() > longest) ? temp.length() : longest;
                } else {
                    
                    //System.out.println(temp);
                    break;
                }
            }
        }
        return longest;
    }
