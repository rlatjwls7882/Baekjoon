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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] strings = new String[4];
		for(int i=0;i<4;i++) {
			strings[i] = st.nextToken();
		}
		
		long max=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					continue;
				}
				for(int k=0;k<4;k++) {
					if(i==k||j==k) {
						continue;
					}
					for(int l=0;l<4;l++) {
						if(i==l||j==l||k==l) {
							continue;
						}
						max = Math.max(max, Long.valueOf(strings[i]+strings[j]+strings[k]+strings[l]));
					}
				}
			}
		}
		bw.write(max+"");
		
		bw.close();
	} // end of main()
} // end of Main class