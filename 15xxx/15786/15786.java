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
		
		// 원본 알파벳의 길이 N, 포스트잇의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		String S = br.readLine();
		
		// 가능성 여부 확인
		while(M-->0) {
			String postit = br.readLine();
			
			int idx=0;
			for(int i=0;i<postit.length();i++) {
				if(S.charAt(idx)==postit.charAt(i)) {
					idx++;
					if(idx==N) {
						break;
					}
				}
			}
			
			if(idx==N) {
				bw.write("true\n");
			} else {
				bw.write("false\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class