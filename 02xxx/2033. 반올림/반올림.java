import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// 정수 N 입력
		String string = br.readLine();
		int length = string.length();
		
		int[] N = new int[length];
		
		for(int i=0;i<length;i++) {
			N[i] = string.charAt(i)-'0';
		}
		
		// 반올림 수행
		for(int i=length-1;i>=1;i--) {
			if(N[i]>=5) {
				N[i-1]++;
			}
		}
		
		// 결과 출력
		bw.write(Integer.toString(N[0]));
		
		while(length-->1) {
			bw.write("0");
		}

		bw.close();
	} // end of main()
} // end of Main class