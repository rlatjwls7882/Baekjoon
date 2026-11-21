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
			int N = Integer.valueOf(bf.readLine());
			int sum = 0;
			StringTokenizer st = new StringTokenizer(bf.readLine());			
			
			while(N--!=0)
				sum += Integer.valueOf(st.nextToken());
			
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class