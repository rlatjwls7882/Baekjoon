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
		int iscute=0, isnotcute=0;
		
		while(N--!=0) {
			int A = Integer.valueOf(bf.readLine());
			
			if(A==1) iscute++;
			else isnotcute++;
		}
		
		if(iscute>isnotcute) bw.write("Junhee is cute!");
		else bw.write("Junhee is not cute!");
		
		bw.close();
	} // end of main
} // end of main class