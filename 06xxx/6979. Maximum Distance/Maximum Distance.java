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
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr1 = new int[N];
			for(int i=0;i<N;i++) {
				arr1[i] = Integer.valueOf(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int[] arr2 = new int[N];
			for(int i=0;i<N;i++) {
				arr2[i] = Integer.valueOf(st.nextToken());
			}
			
			int idx1=0, idx2=0, maxDist=0;
			while(idx1<N&&idx2<N) {
				if(arr1[idx1]>arr2[idx2]) {
					idx1++;
				} else if(arr1[idx1]<arr2[idx2]) {
					idx2++;
				} else {
					maxDist = Math.max(maxDist, idx2-idx1);
					idx2++;
				}
			}
			bw.write("The maximum distance is "+maxDist+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class