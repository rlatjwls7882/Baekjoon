import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 절반 이상 공부한 챕터의 수 계산
		int cnt=0, study=0;
		while(N-->0) {
			int T = Integer.valueOf(br.readLine());
			study += T;
			if(study<30) {
				cnt++;
			} else {
				if(T>=(study-30)*2) {
					cnt++;
				}
				study=0;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class