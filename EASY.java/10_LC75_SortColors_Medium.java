class Solution {

    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else if (nums[i] == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        int index = 0;

        for (int i = 0; i < zeros; i++) {
            nums[index] = 0;
            index++;
        }

        for (int i = 0; i < ones; i++) {
            nums[index] = 1;
            index++;
        }

        for (int i = 0; i < twos; i++) {
            nums[index] = 2;
            index++;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] test1 = {2, 0, 2, 1, 1, 0};
        int[] test2 = {2, 0, 1};

        obj.sortColors(test1);
        obj.sortColors(test2);

        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < test2.length; i++) {
            System.out.print(test2[i] + " ");
        }
        System.out.println();
    }
}
