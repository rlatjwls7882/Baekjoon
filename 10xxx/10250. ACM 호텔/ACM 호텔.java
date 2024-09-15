import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			st = new StringTokenizer(bf.readLine());
			int H = Integer.valueOf(st.nextToken());
					Integer.valueOf(st.nextToken()); // W값 안씀
			int N = Integer.valueOf(st.nextToken());
			
			if(N%H==0)
				bw.write(H+"");
			else
				bw.write(N%H+"");
			
			
			if(N%H>0) {
				if(N/H+1<10)
					bw.write("0");
				
				bw.write(N/H+1+"\n");				
			}
			
			else {
				if(N/H<10)
					bw.write("0");
				
				bw.write(N/H+"\n");
			}
		}
		bw.close();
	} // end of main
} // end of main class