import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double k = Double.valueOf(bf.readLine());
		k=25+k/100;
		
		if(k<100)
			bw.write("100.00");
		
		else if(k>2000)
			bw.write("2000.00");
		
		else
			System.out.printf("%.2f",k);
		bw.close();
	} // end of main
} // end of main class