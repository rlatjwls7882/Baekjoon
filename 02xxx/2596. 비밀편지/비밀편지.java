import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] secret = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
		
		// 문자의 개수 N
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 지은이가 이해한 문자나 모르는 문자가 나온 첫 위치 출력
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N*6;i+=6) {
			
			// 무슨 문자인지 알 수 있는지 확인
			boolean isUnderstand=false;
			
			for(int j=0;j<8;j++) {
				int diff=0;
				
				for(int k=0;k<6;k++) {
					if(string.charAt(i+k)!=secret[j].charAt(k)) {
						diff++;
					}
				}
				
				if(diff<=1) {
					sb.append((char)(j+'A'));
					isUnderstand=true;
					break;
				}
			}
			
			// 무슨 문자인지 알 수 없는 경우
			if(!isUnderstand) {
				sb = new StringBuilder(Integer.toString(i/6+1));
				break;
			}
		}
		
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
} // end of Main class