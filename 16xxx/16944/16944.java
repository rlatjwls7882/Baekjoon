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
		String string = br.readLine();
		
		// 숫자, 소문자, 대문자, 특수 문자중 빠진 것이 있는지 확인
		boolean num=false, lower=false, upper=false, special=false;
		
		for(int i=0;i<N;i++) {
			if('0'<=string.charAt(i)&&string.charAt(i)<='9') {
				num=true;
			} else if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				lower=true;
			} else if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
				upper=true;
			} else {
				special=true;
			}
			
			if(num&&lower&&upper&&special) {
				break;
			}
		}
		
		// 규칙을 위해 추가해야 하는 문자의 최소 개수 계산
		int cnt=0;
		if(!num) {
			cnt++;
		} if(!lower) {
			cnt++;
		} if(!upper) {
			cnt++;
		} if(!special) {
			cnt++;
		}
		
		bw.write(Integer.toString(Math.max(6-N, cnt)));
		
		bw.close();
	} // end of main()
} // end of Main class