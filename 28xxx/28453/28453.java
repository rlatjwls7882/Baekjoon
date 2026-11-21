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

		int N = Integer.valueOf(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		while(N--!=0) {
			int A = Integer.valueOf(st.nextToken());
			
			if(A<250)
				bw.write("4 ");
			else if(A<275)
				bw.write("3 ");
			else if(A<300)
				bw.write("2 ");
			else
				bw.write("1 ");
		}
		
		bw.close();
	} // end of main
} // end of main class