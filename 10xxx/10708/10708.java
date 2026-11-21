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
		
		// 친구들의 수 N, 했던 게임의 수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 타겟의 순서 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] target = new int[M];
		for(int i=0;i<M;i++) {
			target[i] = Integer.valueOf(st.nextToken());
		}
		
		// M개의 게임동안 N명의 친구가 얻는 점수 계산
		int[] score = new int[N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				if(Integer.valueOf(st.nextToken())==target[i]) {
					score[j]++;
				} else {
					score[target[i]-1]++;
				}
			}
		}
		
		// 각 친구들의 점수 출력
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(score[i]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class