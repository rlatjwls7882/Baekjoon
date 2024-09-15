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
		int[] arr = {1,3,5};
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			st = new StringTokenizer(bf.readLine());
			int G = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			int E = Integer.valueOf(st.nextToken());
			
			if(C>E)
				bw.write("0\n");
			else
				bw.write((E-C)*arr[G]+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class