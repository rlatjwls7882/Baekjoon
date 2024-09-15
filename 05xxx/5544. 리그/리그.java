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
		
		int N = Integer.valueOf(br.readLine());
		int[] score = new int[N];
		
		// 점수 계산
		for(int i=0;i<N*(N-1)/2;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			int D = Integer.valueOf(st.nextToken());
			
			if(C>D) {
				score[A]+=3;
			} else if(D>C) {
				score[B]+=3;
			} else {
				score[A]++;
				score[B]++;
			}
		}
		
		// 각 팀의 순위 출력
		for(int i=0;i<N;i++) {
			int rank=1;
			for(int j=0;j<N;j++) {
				if(score[j]>score[i]) {
					rank++;
				}
			}
			
			bw.write(Integer.toString(rank));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class