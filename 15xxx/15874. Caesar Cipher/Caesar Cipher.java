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
		int k = Integer.valueOf(st.nextToken());
		int length = Integer.valueOf(st.nextToken());
		String string = br.readLine();
		
		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 문자열을 k번 민 결과물 출력
		for(int i=0;i<length;i++) {
			if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
				bw.write(upperAlphabet.charAt((string.charAt(i)-'A'+k)%26));
			} else if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				bw.write(upperAlphabet.charAt((string.charAt(i)-'a'+k)%26)+32);
			} else {
				bw.write(string.charAt(i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class