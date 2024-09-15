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
			
			if(st.nextToken().equals(st.nextToken()))
				bw.write("OK\n");
			else
				bw.write("ERROR\n");	
		}
		
		bw.close();
	} // end of main
} // end of main class