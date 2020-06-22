package org.syspar.tests;

public class ReverseString {
    
    public static String mReverseString(String str) {

        StringBuffer builder = new StringBuffer();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            builder.append(str.charAt(i));
        }

        return builder.toString();
    } 

    public static String rReverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(rReverseString("Hello ReverseString"));
        System.out.println(mReverseString("Hello ReverseString"));
    }
}