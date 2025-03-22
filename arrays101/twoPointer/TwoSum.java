package arrays101.twoPointer;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // 앞, 뒤로 더해서 값 탐색
        int left = 0;
        int right = numbers.length-1;

        while(numbers[left]+numbers[right] != target){
            if(numbers[left]+numbers[right]<target){
                left++;
            } else if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
        return new int[] {left+1,right+1};
    }
}
