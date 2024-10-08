import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		long[] arr = new long[N+1];
		arr[0]=arr[1]=1;
		
		for(int i=2;i<=N;i++) {
			for(int j=0;j<i;j++) {
				arr[i] = (arr[i]+arr[j]*arr[i-j-1])%987654321;
			}
		}
		bw.write(Long.toString(arr[N/2]));
		
        bw.close();
    } // end of main
} // end of Main