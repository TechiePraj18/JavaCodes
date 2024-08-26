// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

// Example 3:
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

package Array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {
// HashMap = key, value pair
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length ()- 1));

        for(int i=s.length()-2;i>=0;i--){

            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
            {
                result-=map.get(s.charAt(i));
            }else{
                result +=map.get(s.charAt(i));
            }
        }
        return result;
        
    }

    
}
