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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[N];
		for(int i=0;i<N;i++) {
			num[i] = Integer.valueOf(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					if(num[i]*num[j]==num[k]) {
						cnt++;
					}
				}
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class