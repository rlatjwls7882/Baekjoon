import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double R = Double.valueOf(bf.readLine());
		
		bw.write(R*R*Math.PI+"\n");
		bw.write(R*R*2+"\n");
		
		bw.close();
	} // end of main
} // end of main class