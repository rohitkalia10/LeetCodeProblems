package rohit;

public class ExcelIntToChar {
    public static void main(String[] args) {
        int n =52;
        String sol = "";
        if(n <= 0)
            System.out.println(sol);;

        while(n > 0){
            n--;
            int last = n%26;
            sol = ((char)(last + 65)) + sol;
            n = n/26;
        }
            System.out.println(sol);

        }
    }
