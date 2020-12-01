package rohit;

import java.util.*;

public class ExcelCharToInt {
    public static void main(String[] args) {
        String letters = "AA";
        char[] chars = letters.toCharArray();

        int sum = 0;
        int digit = 0;

        for (int i = chars.length -1; i >= 0; i--) {

            sum += ((chars[i]) - 'A' +1) *Math.pow(26, digit);
            digit++;
        }
        System.out.println(sum);



    }
}
