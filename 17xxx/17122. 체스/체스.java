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
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String first = st.nextToken();
			int second = Integer.valueOf(st.nextToken());
			
			// 두 표기법으로 나타낸 칸이 같은 색인지 확인
			int row = (second-1)/8;
			int col = second%8;
			
			if((first.charAt(1)-'1')%2==row%2) {
				if((first.charAt(0)-'A'+1)%2==col%2) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			} else {
				if((first.charAt(0)-'A'+1)%2!=col%2) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class