class Solution {

    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            if (power % 2 == 1) {
                result = result * x;
            }

            x = x * x;
            power = power / 2;
        }

        if (n < 0) {
            return 1 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.myPow(2.0, 10));
        System.out.println(obj.myPow(2.1, 3));
        System.out.println(obj.myPow(2.0, -2));
        System.out.println(obj.myPow(-0.9999999968539456, -1669585506));
    }
}
