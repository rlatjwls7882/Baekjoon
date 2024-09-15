import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 채팅방의 기록수 N
		int N = Integer.valueOf(br.readLine());
		
		// 곰곰티콘이 사용된 횟수 계산
		HashSet<String> emoticon = new HashSet<String>();
		int use=0;
		
		while(N-->0) {
			String string = br.readLine();
			
			if(string.equals("ENTER"))
				emoticon.clear();
			else if(emoticon.contains(string))
				continue;
			else {
				emoticon.add(string);
				use++;
			}
		}
		
		// 곰곰티콘이 사용된 횟수 출력
		bw.write(use+"");
		
		bw.close();
	} // end of main
} // end of Main class