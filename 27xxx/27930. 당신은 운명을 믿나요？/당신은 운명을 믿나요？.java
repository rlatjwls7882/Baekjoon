import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String korea = "KOREA";
		String yonsei = "YONSEI";
		String string = br.readLine();
		
		// 민지가 합격할 학교 확인
		int kIdx=0, yIdx=0;
		for(int idx=0;idx<string.length();idx++) {
			if(string.charAt(idx)==korea.charAt(kIdx)) {
				kIdx++;
				if(kIdx==5) {
					bw.write(korea);
					break;
				}
			}
			if(string.charAt(idx)==yonsei.charAt(yIdx)) {
				yIdx++;
				if(yIdx==6) {
					bw.write(yonsei);
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class