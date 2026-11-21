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
		
		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			String string = bf.readLine();
			bw.write(string+"\n");
			st = new StringTokenizer(string);
			int c = Integer.valueOf(st.nextToken());
			int p = Integer.valueOf(st.nextToken());
			
			bw.write(c*p-(c-1)*2+"\n");
		}
		bw.close();
	} // end of main
} // end of main class