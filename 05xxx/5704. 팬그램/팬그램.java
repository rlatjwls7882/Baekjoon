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
			if(string.equals("*")) break;

			// 입력받은 문장이 팬그램인지 확인
			int[] lowchars = new int[26];
			for(int i=0;i<string.length();i++)
				if(string.charAt(i)!=' ')
					lowchars[string.charAt(i)-'a']++;

			boolean isPangram=true;
			for(int i=0;i<26;i++)
				if(lowchars[i]==0) {
					isPangram=false;
					break;
				}

			bw.write(isPangram?"Y\n":"N\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class