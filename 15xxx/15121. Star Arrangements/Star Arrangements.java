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
		
		bw.write(N+":\n");
		for(int i=2;i<N;i++) {
			for(int j=i-1;j<=i;j++) {
				int sum=0;
				for(int k=0;sum<N;k++) {
					if(k%2==0) {
						sum += i;
					} else {
						sum += j;
					}
				}
				if(sum==N) {
					bw.write(i+","+j+"\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class