package arrays101;

public class findEvenNumberDigits {
    //짝수 자릿수 개수 파악하기
    public int findNumbers(int[] nums){
        int digits;
        double checkNum;
        int output = 0;

        for(int i=0; i<nums.length; i++){
            // 자릿수 짝수 여부를 어떻게 파악할까?
            // 10으로 나누어서 1보다 크면 다시 또 10으로 나눈다.
            // 나눈 값이 1보다 작아질 때까지 반복하고, 그 횟수를 기록하여 자릿수 판단
            checkNum = nums[i];

            // 숫자는 한 자릿수부터 시작이니 1
            digits = 1;

            // 10으로 나누어지면 계속 반복
            while (checkNum / 10 >= 1){
                checkNum = checkNum / 10;
                digits++;
            }

            // 짝수 자리 숫자인지 파악
            if(digits % 2 == 0){
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        findEvenNumberDigits test = new findEvenNumberDigits();
        System.out.println(test.findNumbers(new int[]{100000}));
    }
}
