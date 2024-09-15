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
		
		// 도시의 수 N, 여행 계획에 속한 도시의 수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 부모를 담을 배열 생성
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i] = i;
		}
		
		// 집합 합치기
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<N;j++) {
				if(string.charAt(j*2)=='1') {
					union(i, j);
				}
			}
		}
		
		// 여행을 할 수 있는지 확인
		StringTokenizer st = new StringTokenizer(br.readLine());
		int before = Integer.valueOf(st.nextToken())-1;
		boolean canTrip=true;
		
		while(M-->1) {
			int cur = Integer.valueOf(st.nextToken())-1;
			
			if(!hasSameParent(before, cur)) {
				canTrip=false;
				break;
			}
			before=cur;
		}
		
		bw.write(canTrip?"YES":"NO");
		
		bw.close();
	} // end of main()
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x<y) {
			parent[y]=x;
		} else if(y<x) {
			parent[x]=y;
		}
	} // end of union()
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static boolean hasSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return true;
		} else {
			return false;
		}
	} // end of hasSameParent()
} // end of Main class