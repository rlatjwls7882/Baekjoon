import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 학생의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 평균 성적 계산
		double average=0;
		for(int i=0;i<N;i++) {
			String string = br.readLine().replace('0', '9').replace('6', '9');
			average += Math.min(Integer.valueOf(string), 100);
		}
		average/=N;
		
		// 평균 성적과 가장 가까운 점수 출력
		bw.write(Integer.toString((int)Math.round(average)));
		
		bw.close();
	} // end of main()
} // end of Main class