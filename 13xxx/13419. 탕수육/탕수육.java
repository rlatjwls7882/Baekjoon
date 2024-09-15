import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 두 사람이 기억해야 할 문자열 계산
			String string = br.readLine();
			int length = string.length();
			
			// 문자열의 길이가 짝수인 경우
			if(length%2==0) {
				for(int i=0;i<length;i+=2) {
					bw.write(string.charAt(i));
				}
				bw.newLine();
				
				for(int i=1;i<length;i+=2) {
					bw.write(string.charAt(i));
				}
				bw.newLine();
			}
			
			// 문자열의 길이가 홀수인 경우
			else {
				char[] A = new char[length];
				char[] B = new char[length];
				
				for(int idx=0, a=0, b=1;idx<length;idx++, a+=2, b+=2) {
					A[idx] = string.charAt(a%length);
					B[idx] = string.charAt(b%length);
				}
				
				for(int i=0;i<length;i++) {
					bw.write(A[i]);
				}
				bw.newLine();
				
				for(int i=0;i<length;i++) {
					bw.write(B[i]);
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class