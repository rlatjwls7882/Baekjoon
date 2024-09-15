import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String string = br.readLine();
		
		// 가능한 차량 번호판의 수 계산
		long cnt=1;
		char last=' ';
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==last) {
				if(string.charAt(i)=='d') cnt*=9;
				else cnt*=25;
			} else {
				if(string.charAt(i)=='d') cnt*=10;
				else cnt*=26;
			}
			cnt%=1000000009;
			last = string.charAt(i);
		}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main
} // end of Main class