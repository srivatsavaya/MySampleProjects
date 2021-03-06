package org.syspar.tests;

public class MaxOccuringChars {

    private static char getMaxOccuringChar(String str) {
        int ASCII_SIZE = 1000;
        //  Create array to keep the count of individual characters and initialize the array as 0 
        int count[] = new int[ASCII_SIZE]; //
        //  Construct character count array from the input string.
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        //  Initialize max count 
        char result = ' ';
        //  Initialize result 
        //  Traversing through the string and maintaining the count of each character 
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    private static void getMaxChars(String str) {

        char[] characters = str.toCharArray();

        System.out.println("****");
        for (char c : characters) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("akfjkfdksfjeirefkdafjfjiorueiqewjkads"));

        getMaxChars("akfjkfdksfjeirefkdafjfjiorueiqewjkads");
    }
}