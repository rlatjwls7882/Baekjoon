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
			if(string.equals("#")) {
				break;
			}
			
			// 첫번째 모음의 위치 확인
			int idx=-1;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') {
					idx=i;
					break;
				}
			}
			
			// 피그라틴어 출력
			if(idx==-1) {
				bw.write(string);
			} else {
				for(int i=idx;i<string.length();i++) {
					bw.write(string.charAt(i));
				}
				
				for(int i=0;i<idx;i++) {
					bw.write(string.charAt(i));
				}
			}
			bw.write("ay\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class