import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		int minCost=Integer.MAX_VALUE;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int cost = Integer.valueOf(st.nextToken());
			int visit = Integer.valueOf(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			boolean existA=false, existB=false;
			while(visit-->0) {
				int next = Integer.valueOf(st.nextToken());
				if(next==A) {
					existA=true;
				} else if(existA&&next==B) {
					existB=true;
				}
			}
			
			if(existA&&existB) {
				minCost = Math.min(minCost, cost);
			}
		}
		
		if(minCost==Integer.MAX_VALUE) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(minCost));
		}
		
		bw.close();
	} // end of main()
} // end of Main class