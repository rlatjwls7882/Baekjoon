import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 쿼리의 개수 M
		int M = Integer.valueOf(br.readLine());
		
		// 미리 계산해놓은 값
		long add=0, xor=0;
		while(M-->0) {
			
			// 쿼리의 종류 Q
			StringTokenizer st = new StringTokenizer(br.readLine());
			int Q = Integer.valueOf(st.nextToken());
			
			// 1번 쿼리
			if(Q==1) {
				long x = Long.valueOf(st.nextToken());
				add += x;
				xor ^= x;
			}
			
			// 2번 쿼리
			else if(Q==2) {
				long x = Long.valueOf(st.nextToken());
				add -= x;
				xor ^= x;
			}
			
			// 3번 쿼리
			else if(Q==3) {
				bw.write(add+"\n");
			}
			
			// 4번 쿼리
			else {
				bw.write(xor+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class