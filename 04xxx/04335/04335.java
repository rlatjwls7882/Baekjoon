import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			
			// 첫번째 질문
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 범위와 정답 확인
			int minAns=0, maxAns=11, ans=0;
			while(true) {
				String word = br.readLine();
				if(word.equals("right on")) {
					ans=N;
					break;
				} else if(word.equals("too high")) {
					maxAns = Math.min(maxAns, N);
				} else {
					minAns = Math.max(minAns, N);
				}
				N = Integer.valueOf(br.readLine());
			}
			
			// 출력
			if(minAns<ans&&ans<maxAns) {
				bw.write("Stan may be honest\n");
			} else {
				bw.write("Stan is dishonest\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class