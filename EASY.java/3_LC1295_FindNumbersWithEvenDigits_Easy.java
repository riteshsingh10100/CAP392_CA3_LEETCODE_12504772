

class Solution {

    public int findNumbers(int[] nums) {
        int count = 0; 

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = 0; 
            while (num > 0) {
                digits++;
                num = num / 10;
            }


            if (digits % 2 == 0) {
                count++;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] test1 = {12, 345, 2, 6, 7896};
        int[] test2 = {555, 901, 482, 1771};

        System.out.println(obj.findNumbers(test1)); 
        System.out.println(obj.findNumbers(test2)); 
    }
}
