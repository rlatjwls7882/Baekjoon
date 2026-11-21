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

		// 마을의 수 n
		int n = Integer.valueOf(br.readLine());
		
		// 모든 마을을 관광하기 위한 최소 이동비용 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0, sum=0;
		
		while(n-->0) {
			int cost = Integer.valueOf(st.nextToken());
			if(max<cost) max=cost;
			sum += cost;
		}
		
		bw.write(sum-max+"");

		bw.close();
	} // end of main
} // end of Main class