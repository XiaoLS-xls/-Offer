class Solution {
	//广度优先
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        // 向右和向下的方向数组
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] vis = new boolean[m][n];
        queue.offer(new int[]{0, 0});			//入队
        vis[0][0] = true;
        int ans = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();		//出队
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 2; ++i) {		//右边和下边的两个格子
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k) {
                    continue;
                }
                queue.offer(new int[]{tx, ty});		
                vis[tx][ty] = true;			//记录是否被访问过
                ans++;
            }
        }
        return ans;
    }

    private int get(int x) {		//题目中的判断
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}

class Solution {
	//深度优先遍历
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];		//记录数组，用于记录已经访问过的位置
        return mm(m,n,k,0,0,visited);
    }
    public int mm(int m, int n, int k,int x, int y,  boolean[][] visited){
        if(x<0 || x>m-1 || y<0 || y>n-1 || visited[x][y] || get(x,k)+get(y,k)>k){		//出口
            return 0;
        }
        visited[x][y] = true;
        return 1+mm(m,n,k,x+1,y,visited)+mm(m,n,k,x,y+1,visited);		//递归条件
    }
    public int get(int x, int k){	//题目额外要求的条件
        int ans = 0;        
        while(x>0){
            ans += x%10;
            x /= 10;
        }
        return ans;
    }
}