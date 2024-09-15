import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int n = Integer.valueOf(bf.readLine());
			int pos=0;
			
			while(n!=0) {
				if(n%2==1)
					bw.write(pos+" ");
				
				n/=2;
				pos++;
			}
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of main class