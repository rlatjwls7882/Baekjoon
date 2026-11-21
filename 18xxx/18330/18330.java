import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(bf.readLine());
		int k = Integer.valueOf(bf.readLine())+60;
		
		if(n<k)
			bw.write(n*1500+"");
		
		else 
			bw.write(k*1500+(n-k)*3000+"");
		
		bw.close();
	} // end of main
} // end of main class