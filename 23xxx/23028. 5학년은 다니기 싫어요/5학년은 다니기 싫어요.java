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
		
		// 현재 수강한 학기 수 N, 전공학점 A, 총 학점 B
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		// 8학기까지 추가로 수업 듣기
		for(int i=N+1;i<=8;i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			A += Math.min(18, X*3);
			B += Math.min(18, (X+Y)*3);
		}
		
		// 졸업조건에 맞출 수 있는지 확인
		if(A>=66&&B>=130) {
			bw.write("Nice");
		} else {
			bw.write("Nae ga wae");
		}
		
		bw.close();
	} // end of main()
} // end of Main class