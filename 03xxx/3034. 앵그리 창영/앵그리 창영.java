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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		
		while(N--!=0) {
			int match = Integer.valueOf(bf.readLine());
			
			if(match<=Math.sqrt(W*W+H*H))
				bw.write("DA\n");
			else
				bw.write("NE\n");
		}
		
		bw.close();
	} // end of main
} // end of main class