import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static boolean[] dfsCheck;
	static boolean[] bfsCheck;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 정점의 개수 N, 간선의 개수 M, 초기 노드 V
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        int V = Integer.valueOf(st.nextToken());
        
        // M개의 간선
        map = new int[N][N];
        
        while(M-->0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken())-1;
        	int b = Integer.valueOf(st.nextToken())-1;
        	
        	map[a][b]=1;
        	map[b][a]=1;
        }
        
        // DFS 수행
        dfsCheck = new boolean[N];
        dfs(V-1);
        
        System.out.println();
        
        // BFS 수행
        bfsCheck = new boolean[N];
        bfs(V-1);
        
    } // end of main
    
    public static void dfs(int i) {
    	
    	dfsCheck[i] = true;
    	System.out.print((i+1)+" ");
    	
    	for(int j=0;j<map.length;j++)
    		if(map[i][j]==1&&!dfsCheck[j])
    			dfs(j);
    	
    } // end of dfs
    
    public static void bfs(int i) {
    	
    	Queue<Integer> q = new LinkedList<Integer>();
    	
    	q.offer(i);
    	bfsCheck[i] = true;
    	
    	while(!q.isEmpty()) {
    		int tmp = q.poll();
    		
    		System.out.print((tmp+1)+" ");
    		
    		for(int j=0;j<map.length;j++)
    			if(map[tmp][j]==1&&!bfsCheck[j]) {
    				bfsCheck[j] = true;
    				q.offer(j);
    			}
    	}
    	
    } // end of bfs
} // end of Main class