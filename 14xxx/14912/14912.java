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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int d = Integer.valueOf(st.nextToken());
		
		// 1~n에서 숫자 d의 빈도수 계산
		int cnt=0;
		for(int i=1;i<=n;i++) {
			cnt += find(i, d);
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
	
	static int find(int n, int d) {
		int cnt=0;
		
		while(n!=0) {
			if(n%10==d) {
				cnt++;
			}
			n/=10;
		}
		
		return cnt;
	} // end of find()
} // end of Main class