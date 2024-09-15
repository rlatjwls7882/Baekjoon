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
		int side=1;
		
		while(side*side<=N)
			side++;
		
		bw.write("The largest square has side length ");
		bw.write(side-1+".");
		bw.close();
	} // end of main
} // end of main class