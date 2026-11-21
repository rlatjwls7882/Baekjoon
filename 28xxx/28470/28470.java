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
		
		// 최대 아드레날린 양 계산
		StringTokenizer A = new StringTokenizer(br.readLine());
		StringTokenizer B = new StringTokenizer(br.readLine());
		StringTokenizer K = new StringTokenizer(br.readLine());
		
		long adrenalin=0;
		while(N-->0) {
			long nextK = (long)(Double.valueOf(K.nextToken())*10);
			if(nextK>10) {
				adrenalin += Long.valueOf(A.nextToken())*nextK/10;
				adrenalin -= Long.valueOf(B.nextToken());
			} else {
				adrenalin += Long.valueOf(A.nextToken());
				adrenalin -= Long.valueOf(B.nextToken())*nextK/10;
			}
		}
		bw.write(Long.toString(adrenalin));
		
		bw.close();
	} // end of main()
} // end of Main class