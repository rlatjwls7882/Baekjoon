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
		
		int n = Integer.valueOf(bf.readLine());
		
		while(n--!=0) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			bw.write("Data set: "+a+" "+b+" "+c+"\n");
			
			while(c--!=0) {
				if(a>b) a/=2;
				else b/=2;
			}
			
			if(a<b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			
			bw.write(a+" "+b+"\n\n");
		}
		
		bw.close();
	} // end of main
} // end of main class