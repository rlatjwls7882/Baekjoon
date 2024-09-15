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
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.valueOf(st.nextToken());
			int f = Integer.valueOf(st.nextToken());
			
			if((i<=1&&f<=2)||(i<=2&&f<=1))
				bw.write("Yes\n");
			else
				bw.write("No\n");
		}
		
		bw.close();
	} // end of main
} // end of main class