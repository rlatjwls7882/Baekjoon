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
		
		long N = Long.valueOf(bf.readLine());
		long max=0;
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			long a = Long.valueOf(st.nextToken());
			long b = Long.valueOf(st.nextToken());
			
			if(a*b>max)
				max = a*b;
		}
		
		bw.write(max+"");
		bw.close();
	} // end of main
} // end of main class