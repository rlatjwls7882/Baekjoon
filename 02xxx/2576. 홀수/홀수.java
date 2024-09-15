import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0, min = 100;
		
		for(int i=0;i<7;i++) {
			int N = Integer.valueOf(bf.readLine());
			
			if(N%2==1) {
				sum+=N;
				if(N<min) min=N;
			}
		}
		
		if(sum==0)
			bw.write("-1");
		
		else
			bw.write(sum+"\n"+min);
		
		bw.close();
	} // end of main
} // end of main class