import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=1;;i++) {
			st = new StringTokenizer(bf.readLine());
			int N = Integer.valueOf(st.nextToken());
			if(N==0) break;
			
			double[] arr = new double[N];
			for(int j=0;j<N;j++)
				arr[j] = Double.valueOf(st.nextToken());
			
			if(N%2==1)
				System.out.printf("Case %d: %.1f\n",i,arr[N/2]);
			else
				System.out.printf("Case %d: %.1f\n",i,(arr[N/2-1]+arr[N/2])/2);
		}
		
	} // end of main
} // end of main class