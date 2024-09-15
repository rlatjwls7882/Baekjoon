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
		
		for(int i=0;i<N;i++) {
			if(i<=N/2) {
				for(int j=0;j<=i*2;j++) {
					bw.write('*');
				}
				for(int j=0;j<4*(N/2-i);j++) {
					bw.write(' ');
				}
				for(int j=0;j<=i*2;j++) {
					bw.write('*');
				}
			} else {
				for(int j=i*2+1;j<N*2;j++) {
					bw.write('*');
				}
				for(int j=0;j<4*(i-N/2);j++) {
					bw.write(' ');
				}
				for(int j=i*2+1;j<N*2;j++) {
					bw.write('*');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class