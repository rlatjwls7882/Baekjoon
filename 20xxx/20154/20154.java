import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int[] strokeNum = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
		String string = br.readLine();
		
		// 마지막 수가 홀수인지 짝수인지 확인
		int sum=0;
		for(int i=0;i<string.length();i++) {
			sum += strokeNum[string.charAt(i)-'A'];
		}
		
		if(sum%2==1) {
			bw.write("I'm a winner!");
		} else {
			bw.write("You're the winner?");
		}
		
		bw.close();
	} // end of main()
} // end of Main class