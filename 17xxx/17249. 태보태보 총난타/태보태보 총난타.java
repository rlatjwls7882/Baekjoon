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
		
		// 왼손의 잔상과, 오른손의 잔상의 수 계산
		int left=0, right=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='@') left++;
			else if(string.charAt(i)=='(') break;
		}
		
		for(int i=string.length()-1;i>=0;i--) {
			if(string.charAt(i)=='@') right++;
			else if(string.charAt(i)==')') break;
		}
		
		bw.write(left+" "+right);
		
		bw.close();
	} // end of main
} // end of Main class