import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int N = Integer.valueOf(bf.readLine());
			
			while(N--!=0) {
				st = new StringTokenizer(bf.readLine());
				int A = Integer.valueOf(st.nextToken());
				int B = Integer.valueOf(st.nextToken());
				
				bw.write(A+B+" ");
				bw.write(A*B+"\n");
			} //end of while N
		} //end of while T
		bw.close();
	} // end of main
} // end of main class