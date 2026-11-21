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
		String N = br.readLine();
		int length = N.length();
		
		// N의 회전 결과물을 모두 더한 값 계산
		long sum=0;
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				sum += (N.charAt((i+j)%length)-'0') * Math.pow(10, length-j-1);
			}
		}
		
		bw.write(Long.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class