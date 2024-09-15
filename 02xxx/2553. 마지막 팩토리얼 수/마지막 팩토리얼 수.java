import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N!의 0이 아닌 최우측수 계산
		int N = Integer.valueOf(br.readLine());
		long facto=1;
		
		for(long i=2;i<=N;i++) {
			facto*=i;
			
			while(facto%10==0) {
				facto/=10;
			}
			
			facto%=1000000;
		}
		
		bw.write(facto%10+"\n");
		
		bw.close();
	} // end of main()
} // end of Main class