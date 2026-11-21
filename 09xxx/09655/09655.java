import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		/* 게임을 이기는 사람 확인
		 * 1 : 상근 (1)
		 * 2 : 창영 (1 1)
		 * 3 : 상근 (3)
		 * 4 : 창영 (3 1)
		 * 5 : 상근 (3 1 1)
		 * 6 : 창영 (3 3 / 3 1 1 1)
		 * 7 : 상근 (3 3 1 / 3 1 1 1 1)
		 */
		
		if(Integer.valueOf(br.readLine())%2==1) {
			bw.write("SK");
		} else {
			bw.write("CY");
		}
		
		bw.close();
	} // end of main()
} // end of Main class