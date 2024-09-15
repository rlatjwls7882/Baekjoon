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
		
		// 알파벳의 길이 N, 만들고 싶은 이름의 길이 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 운영진이 좋아하는 이름을 만들 수 있는지 확인
		String S = br.readLine();
		
		int idx=0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			if(idx==M-1) {
				if(S.charAt(i)!='A'&&S.charAt(i)!='E'&&S.charAt(i)!='I'&&S.charAt(i)!='O'&&S.charAt(i)!='U') {
					sb.append(S.charAt(i));
					idx++;
					break;
				}
			} else if(idx==M-2||idx==M-3) {
				if(S.charAt(i)=='A') {
					sb.append('A');
					idx++;
				}
			} else {
				sb.append(S.charAt(i));
				idx++;
			}
		}
		
		if(idx==M) {
			bw.write("YES\n");
			bw.write(sb.toString());
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class