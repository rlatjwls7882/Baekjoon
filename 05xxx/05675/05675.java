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
			String string = br.readLine();
			if(string==null) {
				break;
			}
			int A = Integer.valueOf(string);
			
			// 시침과 분침이 이루는 각도가 A도가 되는 경우가 있는지 확인
			if(A%6==0) {
				bw.write("Y\n");
			} else {
				bw.write("N\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class