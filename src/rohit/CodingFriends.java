package rohit;

public class CodingFriends {

        public static int minNum(int samDaily, int kellyDaily, int difference)
        {
            // No catching up because samDaily is ahead (positive P) and kellyDaily cannot catch up.
            if (kellyDaily <= samDaily)
            {
                return -1;
            }
            return difference/(kellyDaily - samDaily) + 1;
        }

    public static void main(String[] args) {
        System.out.println(minNum(3,5,6));

    }

}
