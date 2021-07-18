class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>(); 		//hashMap 实现
        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])) return nums[i];
            hm.put(nums[i], hm.get(nums[i]++));
        }
        return 0;
    }
}

//官方解答
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();		//使用Hashset集合（不允许有重复的元素），就不用我们来进行查询了
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
