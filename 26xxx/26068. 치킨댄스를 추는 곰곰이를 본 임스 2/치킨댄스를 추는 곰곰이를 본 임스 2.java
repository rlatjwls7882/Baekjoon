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
		int num=0;
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.valueOf(st.nextToken("D-"));
			
			if(x<=90) num++;
		}
		
		bw.write(num+"");
		bw.close();
	} // end of main
} // end of main class