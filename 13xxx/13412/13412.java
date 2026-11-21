import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// 서로소의 개수 계산
			int cnt=1;
			for(int i=2;i*i<=N;i++) {
				if(N%i==0) {
					int A = i;
					int B = N/A;
					
					while(B!=0) {
						int tmp = A%B;
						A=B;
						B=tmp;
					}
					
					if(A==1) {
						cnt++;
					}
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class