import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=1;;i++) {
			int A = Integer.valueOf(bf.readLine());
			
			if(A==0) break;
			
			bw.write(i+". ");
			
			if(A%2==0)
				bw.write("even "+(A/2)+"\n");
			else
				bw.write("odd "+(A/2)+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class