class Solution {
    public int reverse(int x) {

        int reverseNo = 0;

        while (x != 0) {

            int lastDigit = x % 10;
            x = x / 10;

            if (reverseNo > Integer.MAX_VALUE / 10 ||
                (reverseNo == Integer.MAX_VALUE / 10 && lastDigit > 7) ||
                reverseNo < Integer.MIN_VALUE / 10 ||
                (reverseNo == Integer.MIN_VALUE / 10 && lastDigit < -8)) {

                return 0;
            }

            reverseNo = (reverseNo * 10) + lastDigit;
        }

        return reverseNo;
    }
}