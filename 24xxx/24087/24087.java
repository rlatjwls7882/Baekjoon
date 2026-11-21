import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int S = Integer.valueOf(bf.readLine());
		int A = Integer.valueOf(bf.readLine());
		int B = Integer.valueOf(bf.readLine());
		
		int output=250;
		
		S-=A;
		while(S>0) {
			S-=B;
			output+=100;
		}
			
		bw.write(output+"");
		
		bw.close();
	} // end of main
} // end of main class