import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] sum = new int[10001];
		for(int i=1, cnt=1;cnt<=10000;i++) {
			for(int j=1;j<=i&&cnt<=10000;j++, cnt++) {
				sum[cnt] = sum[cnt-1]+i;
			}
		}
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			bw.write(N+" "+sum[N]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class