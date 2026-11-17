class Solution {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.fib(2));
        System.out.println(obj.fib(3));
        System.out.println(obj.fib(4));
    }
}
