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
	static ArrayList<ArrayList<Node>> bus = new ArrayList<>();
	static long INF = 30_000_000_000L;
	static long[] routeVal;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		// 도시의 개수 N, 버스 노선의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		for(int i=0;i<=N;i++) {
			bus.add(new ArrayList<>());
		}
		
		routeVal = new long[N+1];
		Arrays.fill(routeVal, INF);
		
		// M개의 노선 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			bus.get(A).add(new Node(B, C));
		}
		
		// 도시로 가는 최소시간 계산
		if(BellmanFord()) { // 시간을 무한히 오래 전으로 되돌릴 수 있는 경우
			bw.write("-1");
		} else { // 
			for(int i=2;i<=N;i++) {
				if(routeVal[i]==INF) { // 경로가 없는 경우
					bw.write("-1\n");
				} else {
					bw.write(Long.toString(routeVal[i]));
					bw.newLine();
				}
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean BellmanFord() {
		routeVal[1]=0;
		boolean isUpdating=false;
		
		for(int i=1;i<=N;i++) {
			isUpdating=false;
			
			for(int j=1;j<=N;j++) {
				for(Node next:bus.get(j)) {
					if(routeVal[j]!=INF&&routeVal[next.pos]>routeVal[j]+next.weight) {
						routeVal[next.pos]=routeVal[j]+next.weight;
						isUpdating=true;
					}
				}
			}
			
			if(!isUpdating) {
				break;
			}
		}
		
		// 루프가 도는지 확인
		if(isUpdating) {
			return true;
		} else {
			return false;
		}
	}
	
} // end of Main class

class Node {
	int pos;
	long weight;
	
	public Node(int pos, long weight) {
		this.pos=pos;
		this.weight=weight;
	}
} // end of Node class