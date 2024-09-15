import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long[] t = new long[36];
		t[0]=1;
		
		// t(n) 계산
		int n = Integer.valueOf(br.readLine());
		for(int i=1;i<=n;i++) {
			int left=0, right=i-1;
			
			while(left<i) {
				t[i] += t[left++]*t[right--];
			}
		}
		
		bw.write(Long.toString(t[n]));
		
		bw.close();
	} // end of main()
} // end of Main class