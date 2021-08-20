class Solution {
    public double myPow(double x, int n) {
        //由上而下的递归
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);      //计算能够除的幂
        double mod = myPow(x, n % 2);           //余数
        return half * half * mod;
    }
}

class Solution {
    public double myPow(double x, int n) {
        //将n转化为2进制，按照分解的二进制相乘(快速幂)
		//logn的时间复杂度
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;      //将b分解为2进制，res表示二进制幂相乘的结果
            x *= x;         //x表示的是1,2,4,8次方！！！
            b >>= 1;
        }
        return res;
    }
}