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
		
		int N = Integer.valueOf(br.readLine());
		
		// 팔린 티켓 입력
		boolean[] sold = new boolean[1_000_001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(N-->0) {
			int num = Integer.valueOf(st.nextToken())-1;
			
			if(num<1_000_000) {
				sold[num] = true;
			}
		}
		
		// 안팔린 가장 작은 번호 출력
		for(int i=0;;i++) {
			if(!sold[i]) {
				bw.write(Integer.toString(i+1));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class