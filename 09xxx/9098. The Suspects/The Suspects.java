import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, size;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			
			// 학생 수 n, 그룹 수 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			if(n==0&&m==0) {
				break;
			}
			
			// 초기화
			parent = new int[n];
			for(int j=0;j<n;j++) {
				parent[j]=j;
			}
			
			size = new int[n];
			Arrays.fill(size, 1);
			
			// 그룹 구성원 목록
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				int k = Integer.valueOf(st.nextToken());
				int first = Integer.valueOf(st.nextToken());
				
				while(k-->1) {
					union(first, Integer.valueOf(st.nextToken()));
				}
			}
			
			// 바이러스에 감염이 되었다고 의심이 되는 사람의 수 출력
			bw.write(Integer.toString(size[0]));
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
			size[x] += size[y];
		} else if(x>y) {
			parent[x]=y;
			size[y] += size[x];
		}
	} // end of union()
} // end of Main class