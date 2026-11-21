import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		int M = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		while(M-->0) {
			int pos = Integer.valueOf(st.nextToken())-1;
			
			boolean check=true;
			for(int i=0;i<N;i++) {
				if(A[i]==A[pos]+1) {
					check=false;
					break;
				}
			}
			if(check) {
				A[pos] = Math.min(2019, A[pos]+1);
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(A[i]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class