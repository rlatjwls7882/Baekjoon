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
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			bw.write("Case "+i+": "+
			(Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken()))
			+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class