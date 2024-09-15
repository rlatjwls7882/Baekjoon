import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int L = Integer.valueOf(bf.readLine());
		int T = Integer.valueOf(bf.readLine());
		
		bw.write(T*2-L+"");
		bw.close();
	} // end of main
} // end of main class