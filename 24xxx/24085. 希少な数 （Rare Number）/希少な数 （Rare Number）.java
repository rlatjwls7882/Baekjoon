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
		int[] A = new int[2001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-->0) {
			++A[Integer.valueOf(st.nextToken())];
		}
		
		int min=101, val=0;
		for(int i=1;i<=2000;i++) {
			if(A[i]!=0&&min>A[i]) {
				min=A[i];
				val=i;
			}
		}
		bw.write(Integer.toString(val));
		
		bw.close();
	} // end of main()
} // end of Main class