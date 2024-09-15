import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.valueOf(bf.readLine());
		
		for(int i=1;i<=N;i++) {
			if(i%77==0)
				bw.write("Wiwat!\n");
			else if(i%7==0)
				bw.write("Hurra!\n");
			else if(i%11==0)
				bw.write("Super!\n");
			else
				bw.write(i+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class