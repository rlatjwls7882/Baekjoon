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
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int sum=0, min=100;
			
			while(st.hasMoreTokens()) {
				int num = Integer.valueOf(st.nextToken());

				if(num%2==0) {
					if(num<min) min=num;
					sum+=num;					
				}
			} // end of while st.hasMoreTokens()
			
			bw.write(sum+" "+min+"\n");
		} // end of while T
		bw.close();
	} // end of main
} // end of main class