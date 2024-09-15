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

		// 정원의 세로 길이 N, 가로 길이 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 정원 왼쪽 가장자리에 피어있는 꽃
		int[][] garden = new int[N+1][M+1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=N;i++) {
			garden[i][0] = Integer.valueOf(st.nextToken());
		}
		
		// 정원 위쪽 가장자리에 피어있는 꽃
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=M;i++) {
			garden[0][i] = Integer.valueOf(st.nextToken());
		}
		
		// 정원에 꽃 심기
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(garden[i-1][j]!=garden[i][j-1]) {
					garden[i][j]=1;
				}
			}
		}
		
		// N행 M열에 심어야 하는 꽃 출력
		bw.write(Integer.toString(garden[N][M]));
		
		bw.close();
	} // end of main()
} // end of Main class