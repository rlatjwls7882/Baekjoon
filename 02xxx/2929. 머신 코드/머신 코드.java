import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 머신 코드 프로그램 입력
		String code = br.readLine();
		int length = code.length();
		
		// 삽입해야하는 NOP의 개수 계산
		int NOP=0;
		for(int i=1;i<length;i++) {
			if(code.charAt(i)<='Z'&&(i+NOP)%4!=0) {
				NOP += 4-(i+NOP)%4;
			}
		}
		
		bw.write(Integer.toString(NOP));
		
		bw.close();
	} // end of main()
} // end of Main class