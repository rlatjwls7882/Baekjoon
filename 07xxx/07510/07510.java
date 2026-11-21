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
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			long a = Long.valueOf(st.nextToken());
			long b = Long.valueOf(st.nextToken());
			long c = Long.valueOf(st.nextToken());
			
			bw.write("Scenario #"+i+":\n");
			
			if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b)
				bw.write("yes\n\n");
			else
				bw.write("no\n\n");
			
		} // end of for(int i=1;i<=T;i++) 
		
		bw.close();
	} // end of main
} // end of main class