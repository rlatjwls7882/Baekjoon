import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.valueOf(bf.readLine());
		int B = Integer.valueOf(bf.readLine());
		
		int output=A+B;
		
		while(output>12)
			output-=12;
		
		bw.write(output+"");
		bw.close();
	} // end of main
} // end of main class