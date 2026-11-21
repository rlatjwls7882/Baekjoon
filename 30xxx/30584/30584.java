import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int A = Integer.valueOf(br.readLine());
		int B = Integer.valueOf(br.readLine());
		
		if(Math.abs(A-B)%2==1) {
			bw.write("Error");
		} else if(A>=2&&B>=2) {
			bw.write("Undefined");
		} else {
			int tie = Math.min(A, B);
			bw.write((A-tie)/2+"\n");
			bw.write((B-tie)/2+"\n");
			bw.write(tie+"");
		}
		
		bw.close();
	} // end of main()
} // end of Main class