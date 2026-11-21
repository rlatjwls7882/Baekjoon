import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String string = st.nextToken().toUpperCase();
		int K = Integer.valueOf(st.nextToken());
		
		// 고양이 언어 규칙을 이용해 문자열 변환
		HashSet<Character> used = new HashSet<>();
		for(int i=0;i<string.length();) {
			if(used.add(string.charAt(i))) {
				
				// 길이계산
				int cnt=1;
				for(int j=i+1;j<string.length();j++) {
					if(string.charAt(i)==string.charAt(j)) {
						cnt++;
					} else {
						break;
					}
				}
				
				// 출력
				if(cnt>=K) {
					bw.write("1");
				} else {
					bw.write("0");
				}
			} else {
				i++;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class