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
		int a=1, b=1;
		
		a+=N/2;
		b+=N-N/2;
		
		bw.write(a*b+"");
		bw.close();
	} // end of main
} // end of main class
//2*1
//2*2
//3*2
//3*3