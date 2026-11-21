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
		int A = Integer.valueOf(st.nextToken())+1;
		int B = Integer.valueOf(st.nextToken());

		boolean chk=true;
		long val=(long)Math.pow(2, A);
		for(int E=A;E<64;E++) {
			if(Long.toString(val).charAt(0)-'0'==B) {
				bw.write(Integer.toString(E));
				chk=false;
				break;
			}
			val*=2;
		}
		if(chk) {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class