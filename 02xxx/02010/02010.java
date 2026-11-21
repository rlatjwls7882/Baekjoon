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
		int maxNum = 1;
		
		while(N--!=0)
			maxNum+=Integer.valueOf(bf.readLine())-1;
		
		bw.write(maxNum+"");
		bw.close();
	} // end of main
} // end of main class