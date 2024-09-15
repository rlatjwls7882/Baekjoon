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
			
			bw.write(i+" ");
			
			if(i%6==0) bw.write("Go! ");
			
			else if(i==N) bw.write("Go! ");
		} // end of for i
		
		bw.close();
	} // end of main
} // end of main class