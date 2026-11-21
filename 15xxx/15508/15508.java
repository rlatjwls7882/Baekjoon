import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, size;
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		size = new int[n];
		Arrays.fill(size, 1);
		
		// 함께 보관해야 하는 쌍 입력
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			union(x, y);
		}
		
		// 같이 보관하는 병들의 개수 정렬
		ArrayList<Integer> sizeList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(parent[i]==i&&k-size[i]>=0) {
				sizeList.add(size[i]);
			}
		}
		Collections.sort(sizeList, Collections.reverseOrder());
		
		// 병을 k개, n-k개로 분리 가능한지 확인
		for(int i=0;i<sizeList.size();i++) {
			if(k-sizeList.get(i)>=0) {
				k -= sizeList.get(i);
			}
		}
		
		if(k==0) {
			bw.write("SAFE");
		} else {
			bw.write("DOOMED");
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
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x<y) {
			parent[y]=x;
			size[x] += size[y];
		} else if(x>y) {
			parent[x]=y;
			size[y] += size[x];
		}
		return true;
	} // end of union()
} // end of Main class