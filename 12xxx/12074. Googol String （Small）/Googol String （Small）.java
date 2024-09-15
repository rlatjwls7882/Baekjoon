import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder("001");
		int length=3;
		
		int T = Integer.valueOf(br.readLine());
		for(int i=1;i<=T;i++) {
			int K = Integer.valueOf(br.readLine())-1;
			
			while(length<K) {
				sb.append('0');
				for(int j=length-1;j>=0;j--) {
					if(sb.charAt(j)=='1') {
						sb.append('0');
					} else {
						sb.append('1');
					}
				}
				length = length*2+1;
			}
			bw.write("Case #"+i+": "+sb.charAt(K)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class