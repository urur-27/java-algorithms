package arrays101.twoPointer;

public class SquaresOfSortedArray {
    public int[] sortedSquaresTwoPointer(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // 결과 배열
        int left = 0, right = n - 1; // 투 포인터 설정
        int index = n - 1; // 결과 배열의 뒤에서부터 채우기

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }
}
