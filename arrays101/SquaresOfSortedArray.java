package arrays101;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        // 오름차순으로 정렬된 정수 배열 nums가 주어지고
        // 각 원소의 제곱값을 계산한 후, 이를 오름차순으로 정렬한 배열을 반환
        // 버블 정렬 O(n^2)

        // 1. 각 원소의 값을 제곱하고
        int[] result = new int[nums.length];
        int repo = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];

        }

        // 2. 오름차순으로 정렬
        // 모든 값을 비교해서 가장 작은 값이 앞으로
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (result[i] > result[j]) {
                    repo = result[j];
                    result[j] = result[i];
                    result[i] = repo;
                }
            }
        }
        return result;
    }

    // 투 포인터 알고리즘을 활용하는 함수 O(n)
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



    public static void main(String[] args) {
        SquaresOfSortedArray sol = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}