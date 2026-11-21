import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j<i;j++)
				bw.write("*");
			bw.write("\n");
		}
		for(int i=N-1;i>0;i--) {
			for(int j=0;j<i;j++)
				bw.write("*");
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of main class