import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int A = Integer.valueOf(br.readLine());
		int B = Integer.valueOf(br.readLine());
		
		// DEXOR 수행
		StringBuilder sb = new StringBuilder();
		while(true) {
			if((A%10<=2&&B%10<=2)||(A%10>=7&&B%10>=7)) {
				sb.append('0');
			} else {
				sb.append('9');
			}
			
			A/=10;
			B/=10;
			
			if(A==0&&B==0) {
				break;
			}
		}
		
		// 출력
		bw.write(sb.reverse().toString());
		
		bw.close();
	} // end of main()
} // end of Main class