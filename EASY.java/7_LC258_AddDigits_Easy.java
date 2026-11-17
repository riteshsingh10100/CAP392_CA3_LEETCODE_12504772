class Solution {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.addDigits(38));
        System.out.println(obj.addDigits(0));
        System.out.println(obj.addDigits(9875));
    }
}
