package rohit;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String A = "ABCDEF";
        String B = "ABC";
        char[] strA = A.toCharArray();
        char[] strB = B.toCharArray();


        int l1 = A.length();
        int l2 = B.length();
        int lmin = Math.min(l1, l2);
        String comm = "";
        String ans = "";

        for (int i = 0; i < lmin; i++) {
            if (strA[i] == strB[i]) {
                comm += strA[i];
//                System.out.println("1comm ="+comm);
            }
        }
       int div = comm.length()/2;
        int rem = comm.length()%2;
        if(rem == 0) {
            for (int i = 0; i < div; i++) {
                if (comm.toCharArray()[i] == comm.toCharArray()[div + i])
                ans += comm.toCharArray()[i];
             }
            System.out.println("ans1 =" +ans);
        }
        if(comm.length() >1) {
            for (int i = 0; i < comm.length() - 1; i++) {
                if (comm.toCharArray()[i] == comm.toCharArray()[i + 1]) {
                    ans = Character.toString(comm.toCharArray()[i]);
                    System.out.println("ans2 =" + ans);
                }  System.out.println("comm1 =" + comm);
            }System.out.println("ans ="+ans);
        }else System.out.println("comm2 =" + comm);

    }
}
