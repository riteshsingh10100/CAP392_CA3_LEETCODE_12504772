
class Solution {

    public int maximumWealth(int[][] accounts) {
        int max = 0; 


        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; 


            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max; 
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] test1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] test2 = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(obj.maximumWealth(test1));
        System.out.println(obj.maximumWealth(test2)); 
    }
}
