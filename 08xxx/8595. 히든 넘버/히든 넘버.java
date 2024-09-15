import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// 단어의 길이 n
		int n = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 모든 히든 넘버의 합 계산
		long sum=0, cnt=1;
		for(int i=n-1;i>=0;i--) {
			if('A'<=string.charAt(i)) {
				cnt=1;
			} else {
				sum += (string.charAt(i)-'0')*cnt;
				cnt*=10;
			}
		}
		
		bw.write(Long.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class