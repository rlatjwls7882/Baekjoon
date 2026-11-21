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
		int N = Integer.valueOf(st.nextToken());
		String S = st.nextToken();
		
		// 채팅 기록 입력
		String[][] record = new String[N][2];
		String answer="";
		int answerPos=0;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			record[i][0] = st.nextToken();
			record[i][1] = st.nextToken();
			if(record[i][0].equals(S)) {
				answerPos=i;
				answer=record[i][1];
			}
		}
		
		// 아쉬운 사람의 수 계산
		int cnt=0;
		for(int i=answerPos-1;i>=0;i--) {
			if(record[i][1].equals(answer)) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class