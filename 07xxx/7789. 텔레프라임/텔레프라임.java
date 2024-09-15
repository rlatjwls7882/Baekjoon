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
		
		// 9999999까지의 소수판별
		int length = 10_000_000;
		boolean[] notSosu = new boolean[length];
		
		for(int i=2;i*i<length;i++) {
			if(!notSosu[i]) {
				for(int j=i*i;j<length;j+=i) {
					notSosu[j]=true;
				}
			}
		}
		
		// 원래 전화번호와 새 전화번호가 모두 소수인지 확인
		StringTokenizer st = new StringTokenizer(br.readLine());
		int original = Integer.valueOf(st.nextToken());
		int plus = Integer.valueOf(st.nextToken())*1000000;
		
		if(!notSosu[original]&&!notSosu[original+plus]) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class