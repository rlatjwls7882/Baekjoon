import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int cnt=0;
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String B = br.readLine();
		
		// A와 B가 다르면서 B가 A의 접두사인 개수 계산
		int cnt=0;
		
		while(st.hasMoreTokens()) {
			
			String A = st.nextToken();
			
			if(A.equals(B)||A.length()<B.length()) {
				continue;
			}
			
			boolean isPrefix=true;
			for(int i=0;i<B.length();i++) {
				if(A.charAt(i)!=B.charAt(i)) {
					isPrefix=false;
					break;
				}
			}
			
			if(isPrefix) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class