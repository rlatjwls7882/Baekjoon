import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.valueOf(st.nextToken());
		String string = st.nextToken();
		
		// 카멜 표기법으로 변환
		if(num==2) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='_') {
					i++;
					sb.append((char)(string.charAt(i)-32));
				} else {
					sb.append(string.charAt(i));
				}
			}
			string = sb.toString();
		} else if(num==3) {
			StringBuilder sb = new StringBuilder();
			sb.append((char)(string.charAt(0)+32));
			sb.append(string.substring(1));
			string = sb.toString();
		}
		
		// 카멜 표기법, 스네이크 표기법, 파스칼 표기법으로 출력
		bw.write(string);
		bw.newLine();
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)<='Z') {
				bw.write('_');
				bw.write(string.charAt(i)+32);
			} else {
				bw.write(string.charAt(i));
			}
		}
		bw.newLine();
		
		bw.write(string.charAt(0)-32);
		for(int i=1;i<string.length();i++) {
			bw.write(string.charAt(i));
		}
		
		bw.close();
	} // end of main()
} // end of Main class