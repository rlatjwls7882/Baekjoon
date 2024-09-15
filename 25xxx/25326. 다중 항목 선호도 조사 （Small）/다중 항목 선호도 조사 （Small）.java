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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// n개의 학생들의 선호도 입력
		String[][] like = new String[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				like[i][j] = st.nextToken();
			}
		}
		
		// m개의 질의 수행
		while(m-->0) {
			
			// 질의 입력
			st = new StringTokenizer(br.readLine());
			String[] Q = new String[3];
			for(int i=0;i<3;i++) {
				Q[i] = st.nextToken();
			}
			
			// 질의 결과 계산
			int cnt=0;
			
			for(int i=0;i<n;i++) {
				boolean isCorrect=true;
				
				for(int j=0;j<3;j++) {
					if(!Q[j].equals("-")&&!like[i][j].equals(Q[j])) {
						isCorrect=false;
						break;
					}
				}
				
				if(isCorrect) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class