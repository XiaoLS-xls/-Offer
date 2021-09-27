class Solution {
    public int[] exchange(int[] nums) {
		//前后一起查找，找到后互换
        int beginIndex = 0;
        int endIndex = nums.length-1;
        while(beginIndex<endIndex){
            while(beginIndex<endIndex && nums[beginIndex]%2!=0) beginIndex++;
            while(beginIndex<endIndex && nums[endIndex]%2==0) endIndex--;
            int temp = nums[beginIndex];
            nums[beginIndex] = nums[endIndex];
            nums[endIndex] = temp;
        }
        return nums;
    }
}

class Solution {
    public int[] exchange(int[] nums) {
		//fast搜索下一个奇数位，slow搜索要放的位置
        int low = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] & 1) {		//找奇数位，交换（后边留下来的就刚好是偶数位slow）
                swap(nums[low], nums[fast]);
                low ++;
            }
            fast ++;
        }
        return nums;
    }
}
