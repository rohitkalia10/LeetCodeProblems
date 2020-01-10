package rohit;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String A = "ABABCD";
        String B = "ABAB";
        char[] strA = A.toCharArray();
        char[] strB = B.toCharArray();

        int l1 = A.length();
        int l2 = B.length();
        int lmin = Math.min(l1, l2);
        String comm = "";

        for (int i = 0; i < lmin; i++) {
            if (strA[i] == strB[i]) {
                comm += strA[i];
            }
            for (int x: comm.toCharArray()) {

            }
        }
        System.out.println(comm);
    }



}
