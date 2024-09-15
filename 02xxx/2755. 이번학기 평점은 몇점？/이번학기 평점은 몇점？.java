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

		String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
		double[] score = {4.3, 4, 3.7, 3.3, 3, 2.7, 2.3, 2, 1.7, 1.3, 1, 0.7, 0};
		
		int N = Integer.valueOf(br.readLine());
		
		// 평균 평점 계산
		double totalScore=0, divisor=0;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int s = Integer.valueOf(st.nextToken());
			String g = st.nextToken();
			
			// 과목에 대한 학점과 성적 추가
			divisor += s;
			for(int i=0;i<13;i++) {
				if(g.equals(grade[i])) {
					totalScore += s*score[i];
					break;
				}
			}
		}
		
		bw.write(String.format("%.02f", totalScore/divisor));
		
		bw.close();
	} // end of main()
} // end of Main class