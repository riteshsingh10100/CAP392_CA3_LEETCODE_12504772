
class Solution {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; 

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];     
            ans[i + n] = nums[i]; 
        }

        return ans; 
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] test1 = {1, 2, 1};
        int[] test2 = {1, 3, 2, 1};

        int[] result1 = obj.getConcatenation(test1);
        int[] result2 = obj.getConcatenation(test2);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }
}
