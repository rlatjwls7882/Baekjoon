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

		// n개의 점 x 입력
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] x = new long[n];
		for(int i=0;i<n;i++)
			x[i] = Long.valueOf(st.nextToken());
		
		// 모든 쌍의 거리의 합 계산
		long sum=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				sum += Math.abs(x[i]-x[j]);
		
		bw.write(sum*2+"");
		
		bw.close();
	} // end of main
} // end of Main class