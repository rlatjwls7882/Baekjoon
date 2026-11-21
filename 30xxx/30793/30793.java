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
		double px = Double.valueOf(st.nextToken());
		double rx = Double.valueOf(st.nextToken());
		double vx = px/rx;
		
		// 문자 유형 확인
		if(vx<0.2) {
			bw.write("weak");
		} else if(vx<0.4) {
			bw.write("normal");
		} else if(vx<0.6) {
			bw.write("strong");
		} else {
			bw.write("very strong");
		}
		
		bw.close();
	} // end of main()
} // end of Main class