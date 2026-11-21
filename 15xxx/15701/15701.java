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
		
		// 서로 다른 순서쌍의 개수 계산
		int cnt=0;
		
		for(int i=1;i*i<=N;i++) {
			if(i*i==N) {
				cnt++;
			} else if(N%i==0) {
				cnt+=2;
			}
		}
		
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class