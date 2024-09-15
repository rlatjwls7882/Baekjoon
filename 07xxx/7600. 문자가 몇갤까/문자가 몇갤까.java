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
			String string = br.readLine().toLowerCase();
			if(string.equals("#")) break;
			
			// 등장한 알파벳의 개수 확인
			boolean[] alphabet = new boolean[26];
			int cnt=0;
			
			for(int i=0;i<string.length();i++)
				if('a'<=string.charAt(i)&&string.charAt(i)<='z')
					if(!alphabet[string.charAt(i)-'a']) {
						alphabet[string.charAt(i)-'a']=true;
						cnt++;
					}
			
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class