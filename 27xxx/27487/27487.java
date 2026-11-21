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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			int numOfTwo=0;
			int[] A = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<N;i++) {
				A[i] = Integer.valueOf(st.nextToken());
				if(A[i]==2) {
					numOfTwo++;
				}
			}
			
			int pos=-1, left=0;
			for(int i=0;i<N;i++) {
				if(A[i]==2) {
					left++;
				}
				if(left*2==numOfTwo) {
					pos=i+1;
					break;
				} else if(left*2>numOfTwo) {
					break;
				}
			}
			bw.write(pos+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class