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
		
		int K = Integer.valueOf(bf.readLine());
		
		for(int i=1;i<=K;i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.valueOf(st.nextToken());
			int s = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			int ducats = 0;
			
			for(int j=0;j<n;j++) {
				st = new StringTokenizer(bf.readLine());
				int D = Integer.valueOf(st.nextToken());
				int V = Integer.valueOf(st.nextToken());
				
				if(s*d>=D)
					ducats+=V;
				
			} // end of for j
			bw.write("Data Set ");
			bw.write(i+":\n");
			bw.write(ducats+"\n\n");
		} // end of for i
		bw.close();
	} // end of main
} // end of main class