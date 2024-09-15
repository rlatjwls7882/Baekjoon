import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 가장 낮은 7개의 점수 출력
		float[] score = new float[N];
		for(int i=0;i<N;i++) {
			score[i] = Float.valueOf(br.readLine());
		}
		Arrays.sort(score);
		
		for(int i=0;i<7;i++) {
			bw.write(String.format("%.03f\n", score[i]));
		}
		
		bw.close();
	} // end of main()
} // end of Main class