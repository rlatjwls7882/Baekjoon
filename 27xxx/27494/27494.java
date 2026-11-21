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
		
		// 당첨 티켓 수 계산
		int cnt=0;
		for(int i=2023;i<=N;i++) {
			if(search2023(Integer.toString(i))) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()

	static boolean search2023(String string) {

		int idx=0;
		if(string.indexOf('2')!=-1) {
			idx = string.indexOf('2');
			if(string.indexOf('0', idx)!=-1) {
				idx = string.indexOf('0', idx);
				if(string.indexOf('2', idx)!=-1) {
					idx = string.indexOf('2', idx);
					if(string.indexOf('3', idx)!=-1) {
						return true;
					}
				}
			}
		}

		return false;
	} // end of search2023()
} // end of Main class