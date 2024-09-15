import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 로또에 당첨되었는지 확인
		int cnt=1;
		for(int i=1;i<N;i++) {
			if(Math.abs(string.charAt(i)-string.charAt(i-1))==1) {
				cnt++;
			} else {
				cnt=1;
			}
			if(cnt==5) {
				bw.write("YES");
				break;
			}
		}
		
		if(cnt!=5) {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class