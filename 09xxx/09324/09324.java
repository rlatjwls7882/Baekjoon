import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			String string = br.readLine();
			
			// 진짜 메세지인지 확인
			boolean isReal = true;
			int[] chars = new int[26];
			
			for(int i=0;i<string.length();) {
				if(chars[string.charAt(i)-'A']%3==2) {
					if(i+1>=string.length()||string.charAt(i)!=string.charAt(i+1)) {
						isReal=false;
						break;
					}
					chars[string.charAt(i)-'A']++;
					i+=2;
				} else {
					chars[string.charAt(i)-'A']++;
					i+=1;
				}
			}
			
			// 출력
			if(isReal) {
				bw.write("OK\n");
			} else {
				bw.write("FAKE\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class