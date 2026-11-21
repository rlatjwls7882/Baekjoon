import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 원래 문자열의 길이 N, 세로로 번진 글자의 수 H, 가로로 번진 글자의 수 W
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		
		// 문자 복원
		char[] original = new char[N];
		Arrays.fill(original, '?');
		int cnt=0;
		
		while(H-->0) {
			String string = br.readLine();
			for(int i=0;i<N*W;i++) {
				if(string.charAt(i)!='?'&&original[i/W]=='?') {
					original[i/W] = string.charAt(i);
					cnt++;
				}
			}
			if(cnt==N) {
				break;
			}
		}
		
		// 출력
		for(int i=0;i<N;i++) {
			bw.write(original[i]);
		}
		
		bw.close();
	} // end of main()
} // end of Main class