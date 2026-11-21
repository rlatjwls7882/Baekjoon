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

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 팀의 수 n, 경기 수 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			// 팀당 득점수와 실점수 계산
			double[][] score = new double[n][2];
			
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				double p = Double.valueOf(st.nextToken());
				double q = Double.valueOf(st.nextToken());
				
				score[a][0] += p;
				score[a][1] += q;
				score[b][0] += q;
				score[b][1] += p;
			}
			
			// 최대, 최소 피타고라스 기댓값 계산
			long max=0, min=Long.MAX_VALUE;
			for(int i=0;i<n;i++) {
				long Ex=0;
				if(score[i][0]==0&&score[i][1]==0||score[i][0]==0);
				else {
					Ex = (long)(score[i][0]*score[i][0]*1000
							/(score[i][0]*score[i][0]+score[i][1]*score[i][1]));
				}
				
				if(max<Ex) max=Ex;
				if(min>Ex) min=Ex;
			}
			
			bw.write(String.format("%d\n%d\n", max, min));
		}
		
		bw.close();
	} // end of main()
} // end of Main class