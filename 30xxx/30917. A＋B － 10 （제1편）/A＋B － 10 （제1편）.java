import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// A 찾기
		int A=0;
		for(int i=1;i<=9;i++) {
			bw.write(String.format("? A %d", i));
			bw.newLine();
			bw.flush();
			if(br.readLine().equals("1")) {
				A=i;
				break;
			}
		}
		
		// B 찾기
		int B=0;
		for(int i=1;i<=9;i++) {
			bw.write(String.format("? B %d", i));
			bw.newLine();
			bw.flush();
			if(br.readLine().equals("1")) {
				B=i;
				break;
			}
		}
		
		// A+B의 값 출력
		bw.write(String.format("! %d", A+B));
		
		bw.close();
	} // end of main()
} // end of Main class