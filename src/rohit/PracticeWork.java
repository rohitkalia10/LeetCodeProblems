package rohit;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PracticeWork {

    private static final Scanner scan = new Scanner(System.in);

        public static void main (String[]args) {
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while (testCases > 0) {
                String line = in.nextLine();
                boolean matchFound = false;
                String regex = "<(.+)>([^<]+)</\\1>";
                Pattern pat = Pattern.compile(regex);
                Matcher match = pat.matcher(line);
                while (match.find()) {
                    System.out.println(match.group(2));
                    matchFound = true;
                }
                if ( ! matchFound) {
                    System.out.println("None");
                }

                testCases--;
            }
        }

}

