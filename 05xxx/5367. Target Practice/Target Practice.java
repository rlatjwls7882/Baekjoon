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
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(j==1||j==N) {
					bw.write('|');
				} else if((i==1||i==N)) {
					bw.write('-');
				} else if(i==j||j==N-i+1) {
					bw.write('*');
				} else {
					bw.write(' ');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class