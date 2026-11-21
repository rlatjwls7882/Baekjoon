import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		
		// 점수의 합 계산
		st = new StringTokenizer(br.readLine());
		int[] score = new int[N];
		double sum=0;
		
		for(int i=0;i<N;i++) {
			score[i] = Integer.valueOf(st.nextToken());
			sum += score[i];
		}
		Arrays.sort(score);
		
		for(int i=0;i<L;i++) {
			sum -= score[i];
		}
		for(int i=score.length-H;i<score.length;i++) {
			sum -= score[i];
		}
		
		// 평균 계산
		sum /= score.length-L-H;
		bw.write(Double.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class