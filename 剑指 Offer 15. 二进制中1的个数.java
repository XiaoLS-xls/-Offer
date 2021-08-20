public class Solution {
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {          //1左移n为		与2的n次方与
                ret++;
            }
        }
        return ret;
    }
}

public class Solution {
	//位运算
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n &= n - 1;     //n与n-1与的结果是n的最后一位1变成了0
            ret++;
        }
        return ret;
    }
}

,