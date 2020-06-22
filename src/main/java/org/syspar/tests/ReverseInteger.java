package org.syspar.tests;

public class ReverseInteger {

    public static int getReverseInteger(int x) {
        
        long reversed = 0;
        
        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return (int)reversed;
    }

    public static void main(String[] args) {

        int signedInt = 1434299871;
        System.out.println("Reverse of signed int value: " + getReverseInteger(signedInt));

        int unsignedInt = -2134236461;
        System.out.println("Reverse of unsigned int value: " + getReverseInteger(unsignedInt));
    }
}