import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 각 문어숫자에 대응하는 값
		char[] octopus = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
		int[] val = {0, 1, 2, 3, 4, 5, 6, 7, -1};
	
		while(true) {
			
			// 문어 숫자 입력
			String string = br.readLine();
			if(string.equals("#")) break;
			
			// 대응하는 십진수 계산
			int sum=0;
			for(int i=string.length()-1;i>=0;i--)
				for(int j=0;j<9;j++)
					if(string.charAt(i)==octopus[j]) {
						sum += Math.pow(8, string.length()-1-i)*val[j];
						break;
					}
			
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class