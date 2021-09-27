class Solution {
    public int cuttingRope(int n) {
		//一个数分成若干数的和，要求乘积最大
		//尽量多分3，如果剩余2就乘上，如果剩余1就去掉原来乘的一个3，改成乘4.
        if(n<4) return n-1;
        int num ;
        int a = n%3;
        int b = n/3;
        if(a==0){
            return (int)Math.pow(3,b);
        }else if(a==2){
            return (int)Math.pow(3,b)*2;
        }else{
            return (int)Math.pow(3,b-1)*4;
        }
    }
}