import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 1000!까지의 0이 아닌 최우측수 계산
		int[] facto = new int[1001];
		facto[0]=facto[1]=1; 
		
		for(int i=2;i<1001;i++) {
			facto[i] = facto[i-1]*i;
			
			while(facto[i]%10==0) {
				facto[i]/=10;
			}
			
			facto[i]%=1000;
		}
		
		// N!의 0이 아닌 최우측수 출력
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			bw.write(facto[N]%10+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class