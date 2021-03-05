package rohit;

import java.util.Arrays;

public class zigZagCombinations {

    static int arr[] = new int[]{1,2,3,4,5,6};

    // Method for zig-zag conversion of array
    static int zigZag()
    {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected. The first expected relation
        // is "<"
        boolean flag = true;

        int temp =0;
        int count =0;

        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                    System.out.println("HL -->" +count );
                }

            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                    System.out.println("LH -->" +count );
                }
            }
            flag = !flag; /* flip flag */
        } return count;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
//        zigZag();
        System.out.println("Min moves -->" +zigZag());
    }

}
