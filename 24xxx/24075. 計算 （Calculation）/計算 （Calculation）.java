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
		
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		int plus = A+B;
		int minus = A-B;
		
		if(plus>minus) {
			bw.write(A+B +"\n");
			bw.write(A-B +"");			
		}
		else {
			bw.write(A-B +"\n");
			bw.write(A+B +"");
		}
			
		bw.close();
	} // end of main
} // end of main class