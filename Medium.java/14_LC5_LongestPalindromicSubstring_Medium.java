class Solution {

    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;

        for (int center = 0; center < s.length(); center++) {
            int left = center;
            int right = center;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }

            left = center;
            right = center + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.longestPalindrome("babad"));
        System.out.println(obj.longestPalindrome("cbbd"));
        System.out.println(obj.longestPalindrome("a"));
    }
}
