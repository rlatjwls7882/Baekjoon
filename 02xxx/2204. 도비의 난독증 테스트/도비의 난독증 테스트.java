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
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 대소문자 구분없이 사전상 가장 앞서는 단어 확인
			String first = br.readLine();
			
			while(N-->1) {
				String next = br.readLine();
				
				if(first.compareToIgnoreCase(next)>0) {
					first=next;
				}
			}
			
			bw.write(first);
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class