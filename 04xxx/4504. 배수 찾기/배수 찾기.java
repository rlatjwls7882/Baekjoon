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
		
		while(true) {
			int a = Integer.valueOf(bf.readLine());
			
			if(a==0) break;
			
			else if(a%n==0)
				bw.write(a+" is a multiple of "+n+".\n");
			else
				bw.write(a+" is NOT a multiple of "+n+".\n");
		}
		
		bw.close();
	} // end of main
} // end of main class