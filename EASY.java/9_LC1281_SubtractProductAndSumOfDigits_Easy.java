class Solution {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.subtractProductAndSum(234));
        System.out.println(obj.subtractProductAndSum(4421));
    }
}
