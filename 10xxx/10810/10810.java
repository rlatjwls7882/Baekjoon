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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int[] arr = new int[N+1];
		
		while(M--!=0) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			
			for(int A=i;A<=j;A++)
				arr[A]=k;
		}
		
		for(int i=1;i<N+1;i++)
			bw.write(arr[i]+" ");
		
		bw.close();
	} // end of main
} // end of main class