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
		
		// 수열의 크기 n, 쿼리의 개수 q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int q = Integer.valueOf(st.nextToken());
		
		// 수열 입력
		st = new StringTokenizer(br.readLine());
		long[] list = new long[n];
		for(int i=0;i<n;i++)
			list[i] = Long.valueOf(st.nextToken());
		
		// 쿼리 수행
		while(q-->0) {
			st = new StringTokenizer(br.readLine());
			
			// 1번 쿼리
			if(st.nextToken().equals("1")) {
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				
				// 스왑
				long tmp = list[a];
				list[a] = list[b];
				list[b] = tmp;
				
				// 구간합 계산
				long sum=0;
				
				while(a<b)
					sum += list[a++] + list[b--];
				if(a==b) sum+=list[a];
				
				bw.write(sum+"\n");
			}
			
			// 2번 쿼리
			else {
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				int c = Integer.valueOf(st.nextToken())-1;
				int d = Integer.valueOf(st.nextToken())-1;
				
				// 구간합의 차 계산
				long sum=0;
				
				while(a<b)
					sum += list[a++] + list[b--];
				if(a==b) sum+=list[a];
				
				while(c<d)
					sum -= list[c++] + list[d--];
				if(c==d) sum-=list[c];
				
				bw.write(sum+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class