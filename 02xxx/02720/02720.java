import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int Q=0,D=0,N=0,P=0;
			int C = Integer.valueOf(bf.readLine());
			
			while(C>=25) {
				Q++;
				C-=25;
			}
			while(C>=10) {
				D++;
				C-=10;
			}
			while(C>=5) {
				N++;
				C-=5;
			}
			while(C>=1) {
				P++;
				C-=1;
			}
			
			bw.write(Q+" "+D+" "+N+" "+P+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class