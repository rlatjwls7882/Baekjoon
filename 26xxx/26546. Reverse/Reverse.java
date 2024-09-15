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
			String string = st.nextToken();
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			for(int i=0;i<string.length();i++) {
				if(A<=i&&i<B)
					continue;
				bw.write(string.charAt(i)+"");
			}
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of main class