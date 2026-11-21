import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Node>> road;
	static int INF=100_000_000;
	static int[] routeVal;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		int TC = Integer.valueOf(br.readLine());
		
		while(TC-->0) {
			
			// 지점의 수 N, 도로의 개수 M, 웜홀의 개수 W
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			int W = Integer.valueOf(st.nextToken());
			
			// 초기화
			road = new ArrayList<>();
			for(int i=0;i<=N;i++) {
				road.add(new ArrayList<>());
			}
			
			routeVal = new int[N+1];
			Arrays.fill(routeVal, INF);
			
			// 도로와 웜홀 입력
			for(int i=0;i<M+W;i++) {
				
				// 연결된 두 지점 S E, 이동하는데 걸리는 시간 T
				st = new StringTokenizer(br.readLine());
				int S = Integer.valueOf(st.nextToken());
				int E = Integer.valueOf(st.nextToken());
				int T = Integer.valueOf(st.nextToken());
				
				
				if(i<M) { // 도로인 경우
					road.get(S).add(new Node(E, T));
					road.get(E).add(new Node(S, T));
				} else { // 웜홀인 경우
					road.get(S).add(new Node(E, -T));
				}
			}
			
			// 한 지점에서 시간이 줄어들면서 돌아올 수 있는지 확인
            bw.write(BellmanFord()?"YES\n":"NO\n");
		}
		
		bw.close();
	} // end of main()
	
	static boolean BellmanFord() {
		routeVal[1]=0;
		boolean isUpdating=false;
		
		// 최단거리 업데이트
		for(int i=1;i<=N;i++) {
			isUpdating=false;
			
			for(int j=1;j<=N;j++) {
				for(Node nextNode:road.get(j)) {
					int next = nextNode.end;
					
					if(routeVal[next]>routeVal[j]+nextNode.weight) {
						routeVal[next]=routeVal[j]+nextNode.weight;
						isUpdating=true;
					}
				}
			}
			
			if(!isUpdating) {
				break;
			}
		}
		
		// 사이클을 이루는지 확인
		if(isUpdating) {
			return true;
		}
		
		return false;
	} // end of BellmanFord()
} // end of Main class

class Node {
	int end, weight;
	
	public Node(int end, int weight) {
		this.end=end;
		this.weight=weight;
	}
} // end of Node class