package org.syspar.tests;

import java.util.HashMap;
import java.util.Map;

public class IntegerRoman {

    public static String intToRoman(int num) {

        String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] thousands = { "", "M", "MM", "MMM" };

        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];
    }

    public static int romanToInt(String value) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < value.length(); i++) {
            if (i > 0 && map.get(value.charAt(i)) > map.get(value.charAt(i - 1))) {
                result += map.get(value.charAt(i)) - 2 * map.get(value.charAt(i - 1));
            } else {
                result += map.get(value.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Only works upto integer values are 3000.
        int i = 2002 ;
        String romanValue = intToRoman(i);
        System.out.println("Roman number is: " + romanValue);
        System.out.println("Integer number is: " + romanToInt(romanValue));
    }
}