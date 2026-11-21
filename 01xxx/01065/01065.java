import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 1부터 N 사이의 한수의 개수 계산
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(i/10==0||isHansu(Integer.toString(i))) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
	
	static boolean isHansu(String string) {
		
		int diff = string.charAt(0)-string.charAt(1);
		
		for(int i=0;i<string.length()-1;i++) {
			if(string.charAt(i)-string.charAt(i+1)!=diff) {
				return false;
			}
		}
		
		return true;
	} // end of isHansu()
} // end of Main class