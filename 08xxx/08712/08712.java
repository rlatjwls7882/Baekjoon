import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int n = Integer.valueOf(br.readLine());

		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				for(int j=(i-1)*n+1;j<=i*n;j++) {
					bw.write(j+" ");
				}
			} else {
				for(int j=i*n;j>(i-1)*n;j--) {
					bw.write(j+" ");
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class