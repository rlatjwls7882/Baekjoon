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
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			int U = M*2-N;
			bw.write(U+" "+(M-U)+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class