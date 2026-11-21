import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		long[] arr = new long[10001];
		arr[0]=arr[2]=1;
		for(int i=4;i<=10000;i+=2) {
			for(int j=2;j<=i;j+=2) {
				arr[i] = (arr[i]+arr[j-2]*arr[i-j])%987654321;
			}
		}
		
		int N = Integer.valueOf(br.readLine());
		bw.write(Long.toString(arr[N]));
		
        bw.close();
    } // end of main
} // end of Main