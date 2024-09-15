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
		long start = 2;
		
		while(N--!=0)
			start = (start+start-1);
		
		bw.write(start*start+"");
		bw.close();
	} // end of main
} // end of main class