class Solution {
    public int numWays(int n) {
		//转换成斐波那契数列
		//我们可以将问题f(n)看做：第一步跳一格,剩余f(n-1)、第一步跳两格，剩余f(n-1)的和	[问题分解]
            int a = 1;
            int b = 1;
            if(n==0 || n==1) return 1; 
            for(int i=0; i<n-1; i++){
                int temp = (a+b)%1000000007;
                a = b;
                b = temp;
            }
            return b%1000000007;
        }
}