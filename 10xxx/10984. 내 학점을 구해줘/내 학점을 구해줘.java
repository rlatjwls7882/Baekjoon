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
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int N = Integer.valueOf(bf.readLine());
			int sum=0;
			double G=0;
			
			while(N--!=0) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int C = Integer.valueOf(st.nextToken());
				G += Double.valueOf(st.nextToken())*C;
				sum+= C;
			} // end of while N
			
			bw.write(sum+" "+(G/sum)+"\n");
		} // end of while T

		bw.close();
	} // end of main
} // end of main class