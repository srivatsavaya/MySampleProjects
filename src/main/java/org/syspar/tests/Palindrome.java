package org.syspar.tests;

public class Palindrome {

    int resultStart;
    int resultLength;

    public String checkPalindrome(String value) {

        if (value.length() < 2)
            return value;

        for (int start = 0; start < value.length() - 1; start++) {
            expandRange(value, start, start);
            expandRange(value, start, (start + 1));
        }

        return value.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String s, int begin, int end) {

        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Palindrome");
        
        System.out.println(new Palindrome().checkPalindrome("rama"));

    }

}