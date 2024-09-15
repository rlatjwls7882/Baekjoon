import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// N개의 계단의 높이 입력
		int N = Integer.valueOf(br.readLine());
		int[] stair = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			stair[i] = Integer.valueOf(br.readLine());
		}
		
		// 계단 오르기 게임에서 얻을 수 있는 최대 점수 계산
		int[] maxScore = new int[N+1];
		maxScore[1]=stair[1];
		if(N>=2) {
			maxScore[2]=stair[1]+stair[2];
		}
		
		for(int i=3;i<=N;i++) {
			maxScore[i]=Math.max(maxScore[i-2], maxScore[i-3]+stair[i-1])+stair[i];
		}
		
		bw.write(Integer.toString(maxScore[N]));
		
		bw.close();
	} // end of main()
} // end of Main class