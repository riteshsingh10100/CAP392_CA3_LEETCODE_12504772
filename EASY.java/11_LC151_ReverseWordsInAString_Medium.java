class Solution {

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];

            if (i != 0) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.reverseWords("the sky is blue"));
        System.out.println(obj.reverseWords("  hello world  "));
        System.out.println(obj.reverseWords("a good   example"));
    }
}
