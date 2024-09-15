import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int totalMoney = Integer.valueOf(bf.readLine());
		
		for(int i=0;i<9;i++)
			totalMoney -= Integer.valueOf(bf.readLine());
		
		bw.write(totalMoney+"");
		bw.close();
	} // end of main
} // end of main class