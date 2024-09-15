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
		
		int n = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		boolean check=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i-j==0) {
					continue;
				}
				for(int k=0;k<n;k++) {
					if(i!=k&&j!=k&&(A[i]-A[j])/A[k]!=(A[i]-A[j])/(double)A[k]) {
						check=false;
						i=j=k=n;
					}
				}
			}
		}
		
		bw.write(check?"yes":"no");

		bw.close();
	} // end of main()
} // end of Main class