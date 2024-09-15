import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int w1 = Integer.valueOf(bf.readLine());
		int h1 = Integer.valueOf(bf.readLine());
		int w2 = Integer.valueOf(bf.readLine());
		int h2 = Integer.valueOf(bf.readLine());
		
		if(w2>w1)
			bw.write(w2*2+(h1+h2)*2+4+"");
		else
			bw.write(w1*2+(h1+h2)*2+4+"");
			
		bw.close();
	} // end of main
} // end of main class