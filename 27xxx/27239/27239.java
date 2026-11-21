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
		
		if(n%8==0) //8의 배수일때
			bw.write(n%8+'a'+7);
		else
			bw.write(n%8+'a'-1);
		
		if(n%8==0) //8의 배수일때
			bw.write(n/8+'0');
		else
			bw.write(n/8+'1');
		
		bw.close();
	} // end of main
} // end of main class