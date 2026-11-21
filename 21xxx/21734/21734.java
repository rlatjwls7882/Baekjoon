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
		
		for(int i=0;i<string.length();i++) {
			int tmp = string.charAt(i);
			
			// 아스키 코드의 자릿수의 합
			int sum=0;
			while(tmp!=0) {
				sum += tmp%10;
				tmp/=10;
			}
			
			// 합만큼 각 문자 출력
			for(int j=0;j<sum;j++)
				bw.write(string.charAt(i));
			
			bw.write("\n");
		}

		bw.close();
	} // end of main
} // end of Main class