//Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"



package Strings;

public class LongestCommomPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
    //get the first and last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
    //Comapring charcaters 
        for(int i=0; i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    
}
