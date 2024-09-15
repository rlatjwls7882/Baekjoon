import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int C = Integer.valueOf(br.readLine());
		while(C-->0) {
			int N = Integer.valueOf(br.readLine());
			
			int size=N*4+2;
			for(int i=2;i<=N/2;i++) {
				if(N%i==0) {
					int remain=N/i;
					for(int j=1;j<=remain/2;j++) {
						if(remain%j==0) {
							int k=remain/j;
							size = Math.min(size, 2*(i*j+j*k+k*i));
						}
					}
				}
			}
			bw.write(size+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class