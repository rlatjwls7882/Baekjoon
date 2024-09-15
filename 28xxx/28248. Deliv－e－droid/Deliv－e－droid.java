import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int P = Integer.valueOf(bf.readLine());
		int C = Integer.valueOf(bf.readLine());
		
		int score=P*50-C*10;
		
		if(P>C)
			score+=500;
		
		bw.write(score+"");
		
		bw.close();
	} // end of main
} // end of main class