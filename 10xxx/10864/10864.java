import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 학생의 수 N, 친구 관계의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());

		// 각 학생별 친구의 수 계산
		int[] friends = new int[N];
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			friends[Integer.valueOf(st.nextToken())-1]++;
			friends[Integer.valueOf(st.nextToken())-1]++;
		}
		
		for(int i=0;i<N;i++)
			bw.write(friends[i]+"\n");
		
		bw.close();
	} // end of main
} // end of Main class