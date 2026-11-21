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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// 초기화
			parent = new int[N];
			for(int i=0;i<N;i++) {
				parent[i]=i;
			}
			
			// 통신 영역 합치기
			int[][] area = new int[N][3];
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				area[i][0] = Integer.valueOf(st.nextToken());
				area[i][1] = Integer.valueOf(st.nextToken());
				area[i][2] = Integer.valueOf(st.nextToken());
				
				for(int j=0;j<i;j++) {
					if(parent[i]!=parent[j]&&Math.pow(area[i][0]-area[j][0], 2)+Math.pow(area[i][1]-area[j][1], 2)<=Math.pow(area[i][2]+area[j][2], 2)) {
						union(i, j);
					}
				}
			}
			
			// 통신 영역의 수 계산
			int cnt=0;
			for(int i=0;i<N;i++) {
				if(parent[i]==i) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
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
} // end of Main class