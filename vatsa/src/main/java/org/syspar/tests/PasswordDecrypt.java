package org.syspar.tests;

import java.io.IOException;

public class PasswordDecrypt {
    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING. The function accepts STRING s as
     * parameter.
     */

    public static String decryptPassword(String s) {
        // Write your code here
        if (s.isEmpty())
            System.out.println("Password value cannot be null");

        StringBuilder result = new StringBuilder(20);

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit((s.charAt(i)))) {
                result.append((s.charAt(i)));
                //result.append("");
            } else if ((s.length() > (i + 1)) && (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i + 1)))) {
                result.setCharAt(i, s.charAt(i + 1));
                result.setCharAt(i + 1, s.charAt(i));
                result.setCharAt(i + 2, '*');
            }  else {
                System.out.println(s.length());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {

        String s = "5lPa*0Lp*0e";
        String result = PasswordDecrypt.decryptPassword(s);

        System.out.println(s + " -> " + result);

    }
}