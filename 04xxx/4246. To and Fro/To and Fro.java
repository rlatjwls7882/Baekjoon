import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			String string = br.readLine();
			int M = string.length()/N;
			
			char[][] message = new char[M][N];
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(i%2==0) {
						message[i][j]=string.charAt(i*N+j);
					} else {
						message[i][N-1-j]=string.charAt(i*N+j);
					}
				}
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					bw.write(message[j][i]);
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class