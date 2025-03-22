package arrays101.twoPointer;

public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;
            char extra;

            while (left < right){
                extra = s[right];
                s[right] = s[left];
                s[left] = extra;
                left++;
                right--;
            }
        }
    }
}
