import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 디버깅 시작
		int problem=0;
		while(true) {
			String string = br.readLine();
			
			// 디버깅 끝
			if(string.equals("고무오리 디버깅 끝")) {
				break;
			}
			
			// 문제
			else if(string.equals("문제")) {
				problem++;
			}
			
			// 문제 해결
			else if(string.equals("고무오리")) {
				if(problem==0) {
					problem=2;
				} else {
					problem--;
				}
			}
		}
		
		// 모든 문제를 해결했는지 확인
		if(problem==0) {
			bw.write("고무오리야 사랑해");
		} else {
			bw.write("힝구");
		}
		
		bw.close();
	} // end of main()
} // end of Main class