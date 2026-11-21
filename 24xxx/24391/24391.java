import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 강의의 수 N, 건물의 쌍의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 건물 사이의 연결 확인
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken())-1;
			int j = Integer.valueOf(st.nextToken())-1;
			union(i, j);
		}
		
		// 강의 시간표
		st = new StringTokenizer(br.readLine());
		int[] list = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = Integer.valueOf(st.nextToken())-1;
		}
		
		// 해강이가 밖에 나와야 하는 최소 횟수 계산
		int cnt=0;
		for(int i=0;i<N-1;i++) {
			if(hasDiffParent(list[i], list[i+1])) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
	} // end of union()
	
	static boolean hasDiffParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else {
			return true;
		}
	} // end of hasDiffParent()
} // end of Main class