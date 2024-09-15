import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		
		int output = 1;
		
		while(N>1) {
			output*=N--;
			output%=10;
		}
		
		bw.write(output+"");
		bw.close();
	} // end of main
} // end of main class