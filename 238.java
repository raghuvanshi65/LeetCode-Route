class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul1 = Integer.MIN_VALUE , mul2 = Integer.MIN_VALUE , len = nums.length;
        int count = 0;

        for (int i = 0 ; i < len ; i++) {
            mul1 = mul1 == Integer.MIN_VALUE ? 1 : mul1;
            mul2 = mul2 == Integer.MIN_VALUE ? 1 : mul2;

            if (nums[i] == 0) {
                mul2 *= 1;
                count++;
            } else {
                mul2 *= nums[i];
            }
            mul1 *= nums[i];
        }

        if (mul1 != 0) {
            for (int i = 0 ; i < len ; i++) {
                nums[i] = mul1 / nums[i];
            }
            return nums;
        } else if (count > 1) {
            Arrays.fill(nums , 0);
            return nums;
        } else {
            for (int i = 0 ; i < len ; i++) {
                if (nums[i] != 0)
                    nums[i] = 0;
                else
                    nums[i] = mul2;
            }

            return nums;
        }
    }
}