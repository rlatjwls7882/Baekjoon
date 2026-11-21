import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] word = br.readLine().toCharArray();
		
		// 러시아어 알파벳으로 읽었을 때의 발음 출력
		for(int i=0;i<word.length;i++) {
			if(word[i]=='B') {
				bw.write('v');
			} else if(word[i]=='E') {
				bw.write("ye");
			} else if(word[i]=='H') {
				bw.write('n');
			} else if(word[i]=='P') {
				bw.write('r');
			} else if(word[i]=='C') {
				bw.write('s');
			} else if(word[i]=='Y') {
				bw.write('u');
			} else if(word[i]=='X') {
				bw.write('h');
			} else {
				bw.write(word[i]+32);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class