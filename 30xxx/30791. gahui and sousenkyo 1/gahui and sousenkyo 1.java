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
		
		// 16위의 득표 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int vote = Integer.valueOf(st.nextToken());
		
		// 이번 투표의 경쟁률 계산
		int cnt=0;
		for(int i=0;i<4;i++) {
			if(Integer.valueOf(st.nextToken())+1000>=vote) {
				cnt++;
			} else {
				break;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class