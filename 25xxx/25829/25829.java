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
		
		int n = Integer.valueOf(br.readLine());
		
		// 각각 후보에 대한 투표수 계산
		int[][] totalVotes = new int[2][2];
		
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int e = Integer.valueOf(st.nextToken());
			int v1 = Integer.valueOf(st.nextToken());
			int v2 = Integer.valueOf(st.nextToken());
			totalVotes[0][1] += v1;
			totalVotes[1][1] += v2;
			
			if(v1>v2) {
				totalVotes[0][0] += e;
			} else if(v1<v2) {
				totalVotes[1][0] += e;
			}
		}
		
		// 출력
		if(totalVotes[0][0]>totalVotes[1][0]&&totalVotes[0][1]>totalVotes[1][1]) {
			bw.write("1");
		} else if(totalVotes[0][0]<totalVotes[1][0]&&totalVotes[0][1]<totalVotes[1][1]) {
			bw.write("2");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class