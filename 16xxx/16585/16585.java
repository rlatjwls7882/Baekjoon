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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// Ayu
		st = new StringTokenizer(br.readLine());
		int idx = Integer.valueOf(st.nextToken())-1;
		String dir = st.nextToken();
		int sum=0;
		
		if(dir.equals("left")) {
			while(idx>=0) {
				sum += A[idx];
				idx--;
			}
		} else {
			while(idx<N) {
				sum += A[idx];
				idx++;
			}
		}
		bw.write(sum+" ");
		
		// Budi
		st = new StringTokenizer(br.readLine());
		idx = Integer.valueOf(st.nextToken())-1;
		dir = st.nextToken();
		sum=0;
		
		if(dir.equals("left")) {
			while(idx>=0) {
				if(A[idx]==0) {
					sum++;
				}
				idx--;
			}
		} else {
			while(idx<N) {
				if(A[idx]==0) {
					sum++;
				}
				idx++;
			}
		}
		bw.write(sum+"");
		
		bw.close();
	} // end of main()
} // end of Main class