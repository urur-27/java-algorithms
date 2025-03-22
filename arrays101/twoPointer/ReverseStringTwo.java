package arrays101.twoPointer;

public class ReverseStringTwo {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        // 2*k씩 탐색하도록
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            // arr.length를 벗어나는 경우. length값을 최대로
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
