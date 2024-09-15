import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String string = br.readLine();
			if(string.equals("#")) break;
			
            // 마지막 비트를 올바른 비트로 변환
			int sum=0;
			for(int i=0;i<string.length()-1;i++) {
				bw.write(string.charAt(i));
				sum += string.charAt(i)-'0';
			}
			
			if(string.charAt(string.length()-1)=='e') {
				if(sum%2==0) bw.write("0\n");
				else bw.write("1\n");
			} else {
				if(sum%2==0) bw.write("1\n");
				else bw.write("0\n");
			}
		}

		bw.close();
	} // end of main
} // end of Main class