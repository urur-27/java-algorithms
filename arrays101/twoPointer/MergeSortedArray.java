package arrays101.twoPointer;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsIdx = m+n-1;
        int nums1Idx = m-1;
        int nums2Idx = n-1;

        // 뒤에서부터 비교하며 큰 값을 nums1에 채워넣기
        while (nums1Idx >= 0 && nums2Idx >= 0) {
            if (nums1[nums1Idx] > nums2[nums2Idx]) {
                nums1[numsIdx] = nums1[nums1Idx];
                nums1Idx--;
            } else {
                nums1[numsIdx] = nums2[nums2Idx];
                nums2Idx--;
            }
            numsIdx--;
        }

        // nums2에 남은 값이 있다면 복사
        while (nums2Idx >= 0) {
            nums1[numsIdx] = nums2[nums2Idx];
            nums2Idx--;
            numsIdx--;
        }
    }
}
