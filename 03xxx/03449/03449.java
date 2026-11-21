import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스의 개수 T
		int T = Integer.valueOf(br.readLine());
		
		// 해밍 거리 계산
		while(T-->0) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			int distance=0;
			for(int i=0;i<str1.length();i++)
				if(str1.charAt(i)!=str2.charAt(i))
					distance++;
			
			bw.write(String.format("Hamming distance is %d.\n", distance));
		}
		
		bw.close();
	} // end of main
} // end of Main class