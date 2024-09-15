import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.valueOf(bf.readLine());
		int num = 0;
		
		while(a%10==0)
			a/=10;
		
		while(a!=0) {
			if(a%10==0)
				num++;
			
			a/=10;
		}
		bw.write(num+"");
		
		bw.close();
	} // end of main
} // end of main class