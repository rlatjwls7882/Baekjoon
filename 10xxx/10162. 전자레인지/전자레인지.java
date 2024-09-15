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
		int A=0, B=0, C=0;
		
		while(T>0) {
			if(T>=300) {
				A++;
				T-=300;
			}
			else if(T>=60) {
				B++;
				T-=60;
			}
			else {
				C++;
				T-=10;
			}
		}
		
		if(T==0)
			bw.write(A+" "+B+" "+C);
		else
			bw.write("-1");
		bw.close();
	} // end of main
} // end of main class