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
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			bw.write(String.format("Scenario #%d:\n", i));
			
			// m개의 단어 입력
			int m = Integer.valueOf(br.readLine());
			String[] word = new String[m];
			for(int j=0;j<m;j++) {
				word[j]=br.readLine();
			}
			
			// k개의 비밀번호 출력
			int k = Integer.valueOf(br.readLine());
			while(k-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.valueOf(st.nextToken());
				while(num-->0) {
					bw.write(word[Integer.valueOf(st.nextToken())]);
				}
				bw.newLine();
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class