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

		for(int i=1;;i++) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[N];
			for(int j=0;j<N;j++) {
				a[j] = Integer.valueOf(st.nextToken());
			}
			
			boolean same=false;
			for(int j=0;j<=1000;j++) {
				boolean chk=true;
				for(int k=1;k<N;k++) {
					if(a[k]!=a[k-1]) {
						chk=false;
						break;
					}
				}
				
				if(chk) {
					same=true;
					bw.write("Case "+i+": "+j+" iterations\n");
					break;
				}
				
				int[] aPrime = new int[N];
				aPrime[N-1] = Math.abs(a[0]-a[N-1]);
				for(int k=0;k<N-1;k++) {
					aPrime[k] = Math.abs(a[k]-a[k+1]);
				}
				a = aPrime;
			}
			if(!same) {
				bw.write("Case "+i+": not attained\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class